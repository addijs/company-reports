package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport extends ReportAbstract{
    private DatabaseConnector connector;

    protected DatabaseConnector getDatabaseConnector() {
        if (connector == null) {
            connector = new MysqlDatabaseConnector();
        }
        return connector;
    }

    protected void executeQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        getDatabaseConnector().runQuery(query);
    }

    protected void convertToDocument() {
        System.out.println("Converting To PDF...");
    }
}
