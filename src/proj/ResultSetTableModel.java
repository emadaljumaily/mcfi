/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 * Simple wrapper around Object[] representing a row from the ResultSet.
 */
class Row {
    private final Object[]  values;

    public Row(Object[] values) {
        this.values = values;
    }

    public int getSize() {
        return values.length;
    }

    public Object getValue(int i) {
        return values[i];
    }
}

// TableModel implementation that will be populated by SwingWorker.
public class ResultSetTableModel extends AbstractTableModel {
    private final ResultSetMetaData rsmd;

    private List<Row>               rows;

    public ResultSetTableModel(ResultSetMetaData rsmd, List<Row> rows) {
        this.rsmd = rsmd;
        if (rows != null) {
            this.rows = rows;
        } else {
            this.rows = new ArrayList<Row>();
        }

    }

    public int getRowCount() {
        return rows.size();
    }

    public int getColumnCount() {
        try {
            return rsmd.getColumnCount();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public Object getValue(int row, int column) {
        return rows.get(row).getValue(column);
    }

    public String getColumnName(int col) {
        try {
            return rsmd.getColumnName(col + 1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }

    public Class<?> getColumnClass(int col) {
        String className = "";
        try {
            className = rsmd.getColumnClassName(col);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return className.getClass();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex > rows.size()){
            return null;
        }
        return rows.get(rowIndex).getValue(columnIndex);
    }

    public List<Row> getRows() {
        return this.rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }
}
