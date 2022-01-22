package com.illusionist.data.jdbc;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.model.naming.NamingStrategies;
import io.micronaut.data.model.naming.NamingStrategy;

import java.math.BigDecimal;

@MappedEntity(value = "transactions", namingStrategy = NamingStrategies.UnderScoreSeparatedLowerCase.class)
public class Transaction {

  @Id
  private long transactionId;
  private String user;
  private String symbol;
  private BigDecimal modification;

  public Transaction(
    long transactionId,
    String user,
    String symbol,
    BigDecimal modification) {
    this.transactionId = transactionId;
    this.user = user;
    this.symbol = symbol;
    this.modification = modification;
  }

  public Transaction(String user, String symbol, BigDecimal modification) {
    this.user = user;
    this.symbol = symbol;
    this.modification = modification;
  }

  public long getTransactionId() {
    return transactionId;
  }

  public String getUser() {
    return user;
  }

  public String getSymbol() {
    return symbol;
  }

  public BigDecimal getModification() {
    return modification;
  }
}
