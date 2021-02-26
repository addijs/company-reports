package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;

public abstract class ReportAbstract {
  final public void generate() {
    createDatabaseConnection();
    executeQuery();
    convertToDocument();
  }

  protected void createDatabaseConnection() {
    System.out.println("Creating Database Connection...");
    getDatabaseConnector().createConnection();
  }

  protected abstract DatabaseConnector getDatabaseConnector();
  protected abstract void executeQuery();
  protected abstract void convertToDocument();

}
