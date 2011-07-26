package com.braintreegateway;

/**
 * An Enum representing all of the validation errors from the gateway.
 */
public enum ValidationErrorCode {
    ADDRESS_CANNOT_BE_BLANK("81801"),
    ADDRESS_COMPANY_IS_TOO_LONG("81802"),
    ADDRESS_COUNTRY_CODE_ALPHA2_IS_NOT_ACCEPTED("91814"),
    ADDRESS_COUNTRY_CODE_ALPHA3_IS_NOT_ACCEPTED("91816"),
    ADDRESS_COUNTRY_CODE_NUMERIC_IS_NOT_ACCEPTED("91817"),
    ADDRESS_COUNTRY_NAME_IS_NOT_ACCEPTED("91803"),
    ADDRESS_EXTENDED_ADDRESS_IS_TOO_LONG("81804"),
    ADDRESS_FIRST_NAME_IS_TOO_LONG("81805"),
    ADDRESS_INCONSISTENT_COUNTRY("91815"),
    ADDRESS_LAST_NAME_IS_TOO_LONG("81806"),
    ADDRESS_LOCALITY_IS_TOO_LONG("81807"),
    ADDRESS_POSTAL_CODE_INVALID_CHARACTERS("81813"),
    ADDRESS_POSTAL_CODE_IS_REQUIRED("81808"),
    ADDRESS_POSTAL_CODE_IS_TOO_LONG("81809"),
    ADDRESS_REGION_IS_TOO_LONG("81810"),
    ADDRESS_STREET_ADDRESS_IS_REQUIRED("81811"),
    ADDRESS_STREET_ADDRESS_IS_TOO_LONG("81812"),
    ADDRESS_TOO_MANY_ADDRESSES_PER_CUSTOMER("91818"),

    CREDIT_CARD_BILLING_ADDRESS_CONFLICT("91701"),
    CREDIT_CARD_BILLING_ADDRESS_ID_IS_INVALID("91702"),
    CREDIT_CARD_CANNOT_VERIFY_WITH_SUSPENDED_MERCHANT_ACCOUNT("91724"),
    CREDIT_CARD_CARDHOLDER_NAME_IS_TOO_LONG("81723"),
    CREDIT_CARD_CREDIT_CARD_TYPE_IS_NOT_ACCEPTED("81703"),
    CREDIT_CARD_CREDIT_CARD_TYPE_IS_NOT_ACCEPTED_BY_SUBSCRIPTION_MERCHANT_ACCOUNT("81718"),
    CREDIT_CARD_CUSTOMER_ID_IS_INVALID("91705"),
    CREDIT_CARD_CUSTOMER_ID_IS_REQUIRED("91704"),
    CREDIT_CARD_CVV_IS_INVALID("81707"),
    CREDIT_CARD_CVV_IS_REQUIRED("81706"),
    CREDIT_CARD_EXPIRATION_DATE_CONFLICT("91708"),
    CREDIT_CARD_EXPIRATION_DATE_IS_INVALID("81710"),
    CREDIT_CARD_EXPIRATION_DATE_IS_REQUIRED("81709"),
    CREDIT_CARD_EXPIRATION_DATE_YEAR_IS_INVALID("81711"),
    CREDIT_CARD_EXPIRATION_MONTH_IS_INVALID("81712"),
    CREDIT_CARD_EXPIRATION_YEAR_IS_INVALID("81713"),
    CREDIT_CARD_NUMBER_HAS_INVALID_LENGTH("81716"),
    CREDIT_CARD_NUMBER_IS_INVALID("81715"),
    CREDIT_CARD_NUMBER_IS_REQUIRED("81714"),
    CREDIT_CARD_NUMBER_MUST_BE_TEST_NUMBER("81717"),
    CREDIT_CARD_OPTIONS_UPDATE_EXISTING_TOKEN_IS_INVALID("91723"),
    CREDIT_CARD_TOKEN_INVALID("91718"),
    CREDIT_CARD_TOKEN_IS_IN_USE("91719"),
    CREDIT_CARD_TOKEN_IS_NOT_ALLOWED("91721"),
    CREDIT_CARD_TOKEN_IS_REQUIRED("91722"),
    CREDIT_CARD_TOKEN_IS_TOO_LONG("91720"),

    CUSTOMER_COMPANY_IS_TOO_LONG("81601"),
    CUSTOMER_CUSTOM_FIELD_IS_INVALID("91602"),
    CUSTOMER_CUSTOM_FIELD_IS_TOO_LONG("81603"),
    CUSTOMER_EMAIL_IS_INVALID("81604"),
    CUSTOMER_EMAIL_IS_REQUIRED("81606"),
    CUSTOMER_EMAIL_IS_TOO_LONG("81605"),
    CUSTOMER_FAX_IS_TOO_LONG("81607"),
    CUSTOMER_FIRST_NAME_IS_TOO_LONG("81608"),
    CUSTOMER_ID_IS_INVAILD("91610"), //Deprecated
    CUSTOMER_ID_IS_INVALID("91610"), //Deprecated
    CUSTOMER_ID_IS_IN_USE("91609"),
    CUSTOMER_ID_IS_NOT_ALLOWED("91611"),
    CUSTOMER_ID_IS_REQUIRED("91613"),
    CUSTOMER_ID_IS_TOO_LONG("91612"),
    CUSTOMER_LAST_NAME_IS_TOO_LONG("81613"),
    CUSTOMER_PHONE_IS_TOO_LONG("81614"),
    CUSTOMER_WEBSITE_IS_INVALID("81616"),
    CUSTOMER_WEBSITE_IS_TOO_LONG("81615"),

    DESCRIPTOR_NAME_FORMAT_IS_INVALID("92201"),
    DESCRIPTOR_PHONE_FORMAT_IS_INVALID("92202"),

    SUBSCRIPTION_BILLING_DAY_OF_MONTH_CANNOT_BE_UPDATED("91918"),
    SUBSCRIPTION_BILLING_DAY_OF_MONTH_IS_INVALID("91914"),
    SUBSCRIPTION_BILLING_DAY_OF_MONTH_MUST_BE_NUMERIC("91913"),
    SUBSCRIPTION_CANNOT_ADD_DUPLICATE_ADDON_OR_DISCOUNT("91911"),
    SUBSCRIPTION_CANNOT_EDIT_CANCELED_SUBSCRIPTION("81901"),
    SUBSCRIPTION_CANNOT_EDIT_EXPIRED_SUBSCRIPTION("81910"),
    SUBSCRIPTION_CANNOT_EDIT_PRICE_CHANGING_FIELDS_ON_PAST_DUE_SUBSCRIPTION("91920"),
    SUBSCRIPTION_FIRST_BILLING_DATE_CANNOT_BE_IN_THE_PAST("91916"),
    SUBSCRIPTION_FIRST_BILLING_DATE_CANNOT_BE_UPDATED("91919"),
    SUBSCRIPTION_FIRST_BILLING_DATE_IS_INVALID("91915"),
    SUBSCRIPTION_ID_IS_IN_USE("81902"),
    SUBSCRIPTION_INCONSISTENT_NUMBER_OF_BILLING_CYCLES("91908"),
    SUBSCRIPTION_INCONSISTENT_START_DATE("91917"),
    SUBSCRIPTION_INVALID_REQUEST_FORMAT("91921"),
    SUBSCRIPTION_MERCHANT_ACCOUNT_ID_IS_INVALID("91901"),
    SUBSCRIPTION_NUMBER_OF_BILLING_CYCLES_CANNOT_BE_BLANK("91912"),
    SUBSCRIPTION_NUMBER_OF_BILLING_CYCLES_IS_TOO_SMALL("91909"),
    SUBSCRIPTION_NUMBER_OF_BILLING_CYCLES_MUST_BE_GREATER_THAN_ZERO("91907"),
    SUBSCRIPTION_NUMBER_OF_BILLING_CYCLES_MUST_BE_NUMERIC("91906"),
    SUBSCRIPTION_PAYMENT_METHOD_TOKEN_CARD_TYPE_IS_NOT_ACCEPTED("91902"),
    SUBSCRIPTION_PAYMENT_METHOD_TOKEN_IS_INVALID("91903"),
    SUBSCRIPTION_PAYMENT_METHOD_TOKEN_NOT_ASSOCIATED_WITH_CUSTOMER("91905"),
    SUBSCRIPTION_PLAN_BILLING_FREQUENCY_CANNOT_BE_UPDATED("91922"),
    SUBSCRIPTION_PLAN_ID_IS_INVALID("91904"),
    SUBSCRIPTION_PRICE_CANNOT_BE_BLANK("81903"),
    SUBSCRIPTION_PRICE_FORMAT_IS_INVALID("81904"),
    SUBSCRIPTION_PRICE_IS_TOO_LARGE("81923"),
    SUBSCRIPTION_STATUS_IS_CANCELED("81905"),
    SUBSCRIPTION_TOKEN_FORMAT_IS_INVALID("81906"),
    SUBSCRIPTION_TRIAL_DURATION_FORMAT_IS_INVALID("81907"),
    SUBSCRIPTION_TRIAL_DURATION_IS_REQUIRED("81908"),
    SUBSCRIPTION_TRIAL_DURATION_UNIT_IS_INVALID("81909"),

    SUBSCRIPTION_MODIFICATION_AMOUNT_CANNOT_BE_BLANK("92003"),
    SUBSCRIPTION_MODIFICATION_AMOUNT_IS_INVALID("92002"),
    SUBSCRIPTION_MODIFICATION_AMOUNT_IS_TOO_LARGE("92023"),
    SUBSCRIPTION_MODIFICATION_CANNOT_EDIT_MODIFICATIONS_ON_PAST_DUE_SUBSCRIPTION("92022"),
    SUBSCRIPTION_MODIFICATION_CANNOT_UPDATE_AND_REMOVE("92015"),
    SUBSCRIPTION_MODIFICATION_EXISTING_ID_IS_INCORRECT_KIND("92020"),
    SUBSCRIPTION_MODIFICATION_EXISTING_ID_IS_INVALID("92011"),
    SUBSCRIPTION_MODIFICATION_EXISTING_ID_IS_REQUIRED("92012"),
    SUBSCRIPTION_MODIFICATION_ID_TO_REMOVE_IS_INCORRECT_KIND("92021"),
    SUBSCRIPTION_MODIFICATION_ID_TO_REMOVE_IS_NOT_PRESENT("92016"),
    SUBSCRIPTION_MODIFICATION_INCONSISTENT_NUMBER_OF_BILLING_CYCLES("92018"),
    SUBSCRIPTION_MODIFICATION_INHERITED_FROM_ID_IS_INVALID("92013"),
    SUBSCRIPTION_MODIFICATION_INHERITED_FROM_ID_IS_REQUIRED("92014"),
    SUBSCRIPTION_MODIFICATION_NUMBER_OF_BILLING_CYCLES_CANNOT_BE_BLANK("92017"),
    SUBSCRIPTION_MODIFICATION_NUMBER_OF_BILLING_CYCLES_IS_INVALID("92005"),
    SUBSCRIPTION_MODIFICATION_NUMBER_OF_BILLING_CYCLES_MUST_BE_GREATER_THAN_ZERO("92019"),
    SUBSCRIPTION_MODIFICATION_QUANTITY_CANNOT_BE_BLANK("92004"),
    SUBSCRIPTION_MODIFICATION_QUANTITY_IS_INVALID("92001"),
    SUBSCRIPTION_MODIFICATION_QUANTITY_MUST_BE_GREATER_THAN_ZERO("92010"),

    TRANSACTION_AMOUNT_CANNOT_BE_NEGATIVE("81501"),
    TRANSACTION_AMOUNT_IS_REQUIRED("81502"),
    TRANSACTION_AMOUNT_IS_INVALID("81503"),
    TRANSACTION_AMOUNT_IS_TOO_LARGE("81528"),
    TRANSACTION_AMOUNT_MUST_BE_GREATER_THAN_ZERO("81531"),
    TRANSACTION_BILLING_ADDRESS_CONFLICT("91530"),
    TRANSACTION_CANNOT_BE_VOIDED("91504"),
    TRANSACTION_CANNOT_REFUND_CREDIT("91505"),
    TRANSACTION_CANNOT_REFUND_UNLESS_SETTLED("91506"),
    TRANSACTION_CANNOT_REFUND_WITH_SUSPENDED_MERCHANT_ACCOUNT("91538"),
    TRANSACTION_CANNOT_SUBMIT_FOR_SETTLEMENT("91507"),
    TRANSACTION_CREDIT_CARD_IS_REQUIRED("91508"),
    TRANSACTION_CUSTOM_FIELD_IS_INVALID("91526"),
    TRANSACTION_CUSTOM_FIELD_IS_TOO_LONG("81527"),
    TRANSACTION_CUSTOMER_DEFAULT_PAYMENT_METHOD_CARD_TYPE_IS_NOT_ACCEPTED("81509"),
    TRANSACTION_CUSTOMER_ID_IS_INVALID("91510"),
    TRANSACTION_CUSTOMER_DOES_NOT_HAVE_CREDIT_CARD("91511"),
    TRANSACTION_HAS_ALREADY_BEEN_REFUNDED("91512"),
    TRANSACTION_MERCHANT_ACCOUNT_NAME_IS_INVALID("91513"), //Deprecated
    TRANSACTION_MERCHANT_ACCOUNT_ID_IS_INVALID("91513"),
    TRANSACTION_MERCHANT_ACCOUNT_IS_SUSPENDED("91514"),
    TRANSACTION_ORDER_ID_IS_TOO_LONG("91501"),
    TRANSACTION_PAYMENT_METHOD_CONFLICT("91515"),
    TRANSACTION_PAYMENT_METHOD_DOES_NOT_BELONG_TO_CUSTOMER("91516"),
    TRANSACTION_PAYMENT_METHOD_DOES_NOT_BELONG_TO_SUBSCRIPTION("91527"),
    TRANSACTION_PAYMENT_METHOD_TOKEN_CARD_TYPE_IS_NOT_ACCEPTED("91517"),
    TRANSACTION_PAYMENT_METHOD_TOKEN_IS_INVALID("91518"),
    TRANSACTION_PROCESSOR_AUTHORIZATION_CODE_CANNOT_BE_SET("91519"),
    TRANSACTION_PROCESSOR_AUTHORIZATION_CODE_IS_INVALID("81520"),
    TRANSACTION_PURCHASE_ORDER_NUMBER_IS_TOO_LONG("91537"),
    TRANSACTION_REFUND_AMOUNT_IS_TOO_LARGE("91521"),
    TRANSACTION_SETTLEMENT_AMOUNT_IS_TOO_LARGE("91522"),
    TRANSACTION_SUBSCRIPTION_DOES_NOT_BELONG_TO_CUSTOMER("91529"),
    TRANSACTION_SUBSCRIPTION_ID_IS_INVALID("91528"),
    TRANSACTION_SUBSCRIPTION_STATUS_MUST_BE_PAST_DUE("91531"),
    TRANSACTION_TAX_AMOUNT_CANNOT_BE_NEGATIVE("81534"),
    TRANSACTION_TAX_AMOUNT_FORMAT_IS_INVALID("81535"),
    TRANSACTION_TAX_AMOUNT_IS_TOO_LARGE("81536"),
    TRANSACTION_TYPE_IS_INVALID("91523"),
    TRANSACTION_TYPE_IS_REQUIRED("91524"),
    TRANSACTION_UNSUPPORTED_VOICE_AUTHORIZATION("91539"),
    TRANSACTION_OPTIONS_VAULT_IS_DISABLED("91525"),


    UNKOWN_VALIDATION_ERROR("");

    public String code;

    private ValidationErrorCode(String code) {
        this.code = code;
    }

    public static ValidationErrorCode findByCode(String code) {
        for (ValidationErrorCode validationErrorCode : values()) {
            if (validationErrorCode.code.equals(code)) {
                return validationErrorCode;
            }
        }
        return UNKOWN_VALIDATION_ERROR;
    }

}
