package de.adorsys.xs2a.gateway.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;

@Generated("xs2a-gateway-codegen")
public enum MessageCodeTO {
  FORMAT_ERROR("FORMAT_ERROR"),

  PARAMETER_NOT_CONSISTENT("PARAMETER_NOT_CONSISTENT"),

  PARAMETER_NOT_SUPPORTED("PARAMETER_NOT_SUPPORTED"),

  SERVICE_INVALID("SERVICE_INVALID"),

  RESOURCE_UNKNOWN("RESOURCE_UNKNOWN"),

  RESOURCE_EXPIRED("RESOURCE_EXPIRED"),

  RESOURCE_BLOCKED("RESOURCE_BLOCKED"),

  TIMESTAMP_INVALID("TIMESTAMP_INVALID"),

  PERIOD_INVALID("PERIOD_INVALID"),

  SCA_METHOD_UNKNOWN("SCA_METHOD_UNKNOWN"),

  CONSENT_UNKNOWN("CONSENT_UNKNOWN"),

  SESSIONS_NOT_SUPPORTED("SESSIONS_NOT_SUPPORTED"),

  PAYMENT_FAILED("PAYMENT_FAILED"),

  EXECUTION_DATE_INVALID("EXECUTION_DATE_INVALID"),

  CERTIFICATE_INVALID("CERTIFICATE_INVALID"),

  CERTIFICATE_EXPIRED("CERTIFICATE_EXPIRED"),

  CERTIFICATE_BLOCKED("CERTIFICATE_BLOCKED"),

  CERTIFICATE_REVOKE("CERTIFICATE_REVOKE"),

  CERTIFICATE_MISSING("CERTIFICATE_MISSING"),

  SIGNATURE_INVALID("SIGNATURE_INVALID"),

  SIGNATURE_MISSING("SIGNATURE_MISSING"),

  CORPORATE_ID_INVALID("CORPORATE_ID_INVALID"),

  PSU_CREDENTIALS_INVALID("PSU_CREDENTIALS_INVALID"),

  CONSENT_INVALID("CONSENT_INVALID"),

  CONSENT_EXPIRED("CONSENT_EXPIRED"),

  TOKEN_UNKNOWN("TOKEN_UNKNOWN"),

  TOKEN_INVALID("TOKEN_INVALID"),

  TOKEN_EXPIRED("TOKEN_EXPIRED"),

  REQUIRED_KID_MISSING("REQUIRED_KID_MISSING"),

  SERVICE_BLOCKED("SERVICE_BLOCKED"),

  PRODUCT_INVALID("PRODUCT_INVALID"),

  PRODUCT_UNKNOWN("PRODUCT_UNKNOWN"),

  REQUESTED_FORMATS_INVALID("REQUESTED_FORMATS_INVALID"),

  STATUS_INVALID("STATUS_INVALID"),

  ACCESS_EXCEEDED("ACCESS_EXCEEDED");

  private String value;

  MessageCodeTO(String value) {
    this.value = value;
  }

  @JsonCreator
  public static MessageCodeTO fromValue(String value) {
    for (MessageCodeTO e : MessageCodeTO.values()) {
      if (e.value.equals(value)) {
        return e;
      }
    }
    return null;
  }

  @Override
  @JsonValue
  public String toString() {
    return value;
  }
}
