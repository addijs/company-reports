package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends ReportAbstract {
    private DatabaseConnector connector;

    protected DatabaseConnector getDatabaseConnector() {
        if (connector == null) {
            connector = new PostgreSQLDatabaseConnector();
        }
        return connector;
    }

    protected void executeQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        getDatabaseConnector().runQuery(query);
    }

    protected void convertToDocument() {
        System.out.println("Converting To XLS...");
    }
}
