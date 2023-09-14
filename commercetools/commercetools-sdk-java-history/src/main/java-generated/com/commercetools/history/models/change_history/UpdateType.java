
package com.commercetools.history.models.change_history;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * UpdateType
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface UpdateType extends JsonEnum {

    UpdateType ADD_ADDRESS = UpdateTypeEnum.ADD_ADDRESS;

    UpdateType ADD_ASSET = UpdateTypeEnum.ADD_ASSET;

    UpdateType ADD_ASSOCIATE = UpdateTypeEnum.ADD_ASSOCIATE;

    UpdateType ADD_ATTRIBUTE_DEFINITION = UpdateTypeEnum.ADD_ATTRIBUTE_DEFINITION;

    UpdateType ADD_BILLING_ADDRESS_ID = UpdateTypeEnum.ADD_BILLING_ADDRESS_ID;

    UpdateType ADD_CUSTOM_LINE_ITEM = UpdateTypeEnum.ADD_CUSTOM_LINE_ITEM;

    UpdateType ADD_DELIVERY = UpdateTypeEnum.ADD_DELIVERY;

    UpdateType ADD_DISCOUNT_CODE = UpdateTypeEnum.ADD_DISCOUNT_CODE;

    UpdateType ADD_ENUM_VALUE = UpdateTypeEnum.ADD_ENUM_VALUE;

    UpdateType ADD_EXTERNAL_IMAGE = UpdateTypeEnum.ADD_EXTERNAL_IMAGE;

    UpdateType ADD_FIELD_DEFINITION = UpdateTypeEnum.ADD_FIELD_DEFINITION;

    UpdateType ADD_INTERFACE_INTERACTION = UpdateTypeEnum.ADD_INTERFACE_INTERACTION;

    UpdateType ADD_ITEM_SHIPPING_ADDRESS = UpdateTypeEnum.ADD_ITEM_SHIPPING_ADDRESS;

    UpdateType ADD_LINE_ITEM = UpdateTypeEnum.ADD_LINE_ITEM;

    UpdateType ADD_LOCALIZED_ENUM_VALUE = UpdateTypeEnum.ADD_LOCALIZED_ENUM_VALUE;

    UpdateType ADD_LOCATION = UpdateTypeEnum.ADD_LOCATION;

    UpdateType ADD_PARCEL_TO_DELIVERY = UpdateTypeEnum.ADD_PARCEL_TO_DELIVERY;

    UpdateType ADD_PAYMENT = UpdateTypeEnum.ADD_PAYMENT;

    UpdateType ADD_PLAIN_ENUM_VALUE = UpdateTypeEnum.ADD_PLAIN_ENUM_VALUE;

    UpdateType ADD_PRICE = UpdateTypeEnum.ADD_PRICE;

    UpdateType ADD_PRODUCT = UpdateTypeEnum.ADD_PRODUCT;

    UpdateType ADD_PRODUCT_SELECTION = UpdateTypeEnum.ADD_PRODUCT_SELECTION;

    UpdateType ADD_PROPERTY = UpdateTypeEnum.ADD_PROPERTY;

    UpdateType ADD_RETURN_INFO = UpdateTypeEnum.ADD_RETURN_INFO;

    UpdateType ADD_ROLES = UpdateTypeEnum.ADD_ROLES;

    UpdateType ADD_SHIPPING_ADDRESS_ID = UpdateTypeEnum.ADD_SHIPPING_ADDRESS_ID;

    UpdateType ADD_TAX_RATE = UpdateTypeEnum.ADD_TAX_RATE;

    UpdateType ADD_TEXT_LINE_ITEM = UpdateTypeEnum.ADD_TEXT_LINE_ITEM;

    UpdateType ADD_TO_CATEGORY = UpdateTypeEnum.ADD_TO_CATEGORY;

    UpdateType ADD_TRANSACTION = UpdateTypeEnum.ADD_TRANSACTION;

    UpdateType ADD_VARIANT = UpdateTypeEnum.ADD_VARIANT;

    UpdateType CHANGE_ADDRESS = UpdateTypeEnum.CHANGE_ADDRESS;

    UpdateType CHANGE_AMOUNT_AUTHORIZED = UpdateTypeEnum.CHANGE_AMOUNT_AUTHORIZED;

    UpdateType CHANGE_AMOUNT_PLANNED = UpdateTypeEnum.CHANGE_AMOUNT_PLANNED;

    UpdateType CHANGE_ASSET_NAME = UpdateTypeEnum.CHANGE_ASSET_NAME;

    UpdateType CHANGE_ASSET_ORDER = UpdateTypeEnum.CHANGE_ASSET_ORDER;

    UpdateType CHANGE_ASSOCIATE = UpdateTypeEnum.CHANGE_ASSOCIATE;

    UpdateType CHANGE_ASSOCIATE_MODE = UpdateTypeEnum.CHANGE_ASSOCIATE_MODE;

    UpdateType CHANGE_ATTRIBUTE_CONSTRAINT = UpdateTypeEnum.CHANGE_ATTRIBUTE_CONSTRAINT;

    UpdateType CHANGE_ATTRIBUTE_NAME = UpdateTypeEnum.CHANGE_ATTRIBUTE_NAME;

    UpdateType CHANGE_ATTRIBUTE_ORDER_BY_NAME = UpdateTypeEnum.CHANGE_ATTRIBUTE_ORDER_BY_NAME;

    UpdateType CHANGE_CART_DISCOUNTS = UpdateTypeEnum.CHANGE_CART_DISCOUNTS;

    UpdateType CHANGE_CART_PREDICATE = UpdateTypeEnum.CHANGE_CART_PREDICATE;

    UpdateType CHANGE_CUSTOM_LINE_ITEM_QUANTITY = UpdateTypeEnum.CHANGE_CUSTOM_LINE_ITEM_QUANTITY;

    UpdateType CHANGE_DESCRIPTION = UpdateTypeEnum.CHANGE_DESCRIPTION;

    UpdateType CHANGE_EMAIL = UpdateTypeEnum.CHANGE_EMAIL;

    UpdateType CHANGE_ENUM_KEY = UpdateTypeEnum.CHANGE_ENUM_KEY;

    UpdateType CHANGE_ENUM_VALUE_LABEL = UpdateTypeEnum.CHANGE_ENUM_VALUE_LABEL;

    UpdateType CHANGE_ENUM_VALUE_ORDER = UpdateTypeEnum.CHANGE_ENUM_VALUE_ORDER;

    UpdateType CHANGE_FIELD_DEFINITION_ORDER = UpdateTypeEnum.CHANGE_FIELD_DEFINITION_ORDER;

    UpdateType CHANGE_GROUPS = UpdateTypeEnum.CHANGE_GROUPS;

    UpdateType CHANGE_INITIAL = UpdateTypeEnum.CHANGE_INITIAL;

    UpdateType CHANGE_INPUT_HINT = UpdateTypeEnum.CHANGE_INPUT_HINT;

    UpdateType CHANGE_IS_ACTIVE = UpdateTypeEnum.CHANGE_IS_ACTIVE;

    UpdateType CHANGE_IS_SEARCHABLE = UpdateTypeEnum.CHANGE_IS_SEARCHABLE;

    UpdateType CHANGE_KEY = UpdateTypeEnum.CHANGE_KEY;

    UpdateType CHANGE_LABEL = UpdateTypeEnum.CHANGE_LABEL;

    UpdateType CHANGE_LINE_ITEM_NAME = UpdateTypeEnum.CHANGE_LINE_ITEM_NAME;

    UpdateType CHANGE_LINE_ITEM_QUANTITY = UpdateTypeEnum.CHANGE_LINE_ITEM_QUANTITY;

    UpdateType CHANGE_LINE_ITEMS_ORDER = UpdateTypeEnum.CHANGE_LINE_ITEMS_ORDER;

    UpdateType CHANGE_LOCALIZED_ENUM_VALUE_LABEL = UpdateTypeEnum.CHANGE_LOCALIZED_ENUM_VALUE_LABEL;

    UpdateType CHANGE_LOCALIZED_ENUM_VALUE_ORDER = UpdateTypeEnum.CHANGE_LOCALIZED_ENUM_VALUE_ORDER;

    UpdateType CHANGE_MASTER_VARIANT = UpdateTypeEnum.CHANGE_MASTER_VARIANT;

    UpdateType CHANGE_NAME = UpdateTypeEnum.CHANGE_NAME;

    UpdateType CHANGE_ORDER_HINT = UpdateTypeEnum.CHANGE_ORDER_HINT;

    UpdateType CHANGE_ORDER_STATE = UpdateTypeEnum.CHANGE_ORDER_STATE;

    UpdateType CHANGE_PARENT = UpdateTypeEnum.CHANGE_PARENT;

    UpdateType CHANGE_PARENT_UNIT = UpdateTypeEnum.CHANGE_PARENT_UNIT;

    UpdateType CHANGE_PAYMENT_STATE = UpdateTypeEnum.CHANGE_PAYMENT_STATE;

    UpdateType CHANGE_PLAIN_ENUM_VALUE_LABEL = UpdateTypeEnum.CHANGE_PLAIN_ENUM_VALUE_LABEL;

    UpdateType CHANGE_PREDICATE = UpdateTypeEnum.CHANGE_PREDICATE;

    UpdateType CHANGE_PRICE = UpdateTypeEnum.CHANGE_PRICE;

    UpdateType CHANGE_PRODUCT_SELECTION_ACTIVE = UpdateTypeEnum.CHANGE_PRODUCT_SELECTION_ACTIVE;

    UpdateType CHANGE_QUANTITY = UpdateTypeEnum.CHANGE_QUANTITY;

    UpdateType CHANGE_QUOTE_REQUEST_STATE = UpdateTypeEnum.CHANGE_QUOTE_REQUEST_STATE;

    UpdateType CHANGE_QUOTE_STATE = UpdateTypeEnum.CHANGE_QUOTE_STATE;

    UpdateType CHANGE_REQUIRES_DISCOUNT_CODE = UpdateTypeEnum.CHANGE_REQUIRES_DISCOUNT_CODE;

    UpdateType CHANGE_REVIEW_RATING_STATISTICS = UpdateTypeEnum.CHANGE_REVIEW_RATING_STATISTICS;

    UpdateType CHANGE_SHIPMENT_STATE = UpdateTypeEnum.CHANGE_SHIPMENT_STATE;

    UpdateType CHANGE_SLUG = UpdateTypeEnum.CHANGE_SLUG;

    UpdateType CHANGE_SORT_ORDER = UpdateTypeEnum.CHANGE_SORT_ORDER;

    UpdateType CHANGE_STACKING_MODE = UpdateTypeEnum.CHANGE_STACKING_MODE;

    UpdateType CHANGE_STAGED_QUOTE_STATE = UpdateTypeEnum.CHANGE_STAGED_QUOTE_STATE;

    UpdateType CHANGE_STATUS = UpdateTypeEnum.CHANGE_STATUS;

    UpdateType CHANGE_TARGET = UpdateTypeEnum.CHANGE_TARGET;

    UpdateType CHANGE_TAX_CALCULATION_MODE = UpdateTypeEnum.CHANGE_TAX_CALCULATION_MODE;

    UpdateType CHANGE_TAX_MODE = UpdateTypeEnum.CHANGE_TAX_MODE;

    UpdateType CHANGE_TAX_ROUNDING_MODE = UpdateTypeEnum.CHANGE_TAX_ROUNDING_MODE;

    UpdateType CHANGE_TEXT_LINE_ITEM_NAME = UpdateTypeEnum.CHANGE_TEXT_LINE_ITEM_NAME;

    UpdateType CHANGE_TEXT_LINE_ITEM_QUANTITY = UpdateTypeEnum.CHANGE_TEXT_LINE_ITEM_QUANTITY;

    UpdateType CHANGE_TEXT_LINE_ITEMS_ORDER = UpdateTypeEnum.CHANGE_TEXT_LINE_ITEMS_ORDER;

    UpdateType CHANGE_TRANSACTION_INTERACTION_ID = UpdateTypeEnum.CHANGE_TRANSACTION_INTERACTION_ID;

    UpdateType CHANGE_TRANSACTION_STATE = UpdateTypeEnum.CHANGE_TRANSACTION_STATE;

    UpdateType CHANGE_TRANSACTION_TIMESTAMP = UpdateTypeEnum.CHANGE_TRANSACTION_TIMESTAMP;

    UpdateType CHANGE_TYPE = UpdateTypeEnum.CHANGE_TYPE;

    UpdateType CHANGE_VALUE = UpdateTypeEnum.CHANGE_VALUE;

    UpdateType MOVE_IMAGE_TO_POSITION = UpdateTypeEnum.MOVE_IMAGE_TO_POSITION;

    UpdateType PUBLISH = UpdateTypeEnum.PUBLISH;

    UpdateType REMOVE_ADDRESS = UpdateTypeEnum.REMOVE_ADDRESS;

    UpdateType REMOVE_ASSET = UpdateTypeEnum.REMOVE_ASSET;

    UpdateType REMOVE_ASSOCIATE = UpdateTypeEnum.REMOVE_ASSOCIATE;

    UpdateType REMOVE_ATTRIBUTE_DEFINITION = UpdateTypeEnum.REMOVE_ATTRIBUTE_DEFINITION;

    UpdateType REMOVE_BILLING_ADDRESS_ID = UpdateTypeEnum.REMOVE_BILLING_ADDRESS_ID;

    UpdateType REMOVE_CUSTOM_LINE_ITEM = UpdateTypeEnum.REMOVE_CUSTOM_LINE_ITEM;

    UpdateType REMOVE_DELIVERY = UpdateTypeEnum.REMOVE_DELIVERY;

    UpdateType REMOVE_DISCOUNT_CODE = UpdateTypeEnum.REMOVE_DISCOUNT_CODE;

    UpdateType REMOVE_ENUM_VALUES = UpdateTypeEnum.REMOVE_ENUM_VALUES;

    UpdateType REMOVE_FIELD_DEFINITION = UpdateTypeEnum.REMOVE_FIELD_DEFINITION;

    UpdateType REMOVE_FROM_CATEGORY = UpdateTypeEnum.REMOVE_FROM_CATEGORY;

    UpdateType REMOVE_IMAGE = UpdateTypeEnum.REMOVE_IMAGE;

    UpdateType REMOVE_ITEM_SHIPPING_ADDRESS = UpdateTypeEnum.REMOVE_ITEM_SHIPPING_ADDRESS;

    UpdateType REMOVE_LINE_ITEM = UpdateTypeEnum.REMOVE_LINE_ITEM;

    UpdateType REMOVE_LOCATION = UpdateTypeEnum.REMOVE_LOCATION;

    UpdateType REMOVE_PARCEL_FROM_DELIVERY = UpdateTypeEnum.REMOVE_PARCEL_FROM_DELIVERY;

    UpdateType REMOVE_PAYMENT = UpdateTypeEnum.REMOVE_PAYMENT;

    UpdateType REMOVE_PRICE = UpdateTypeEnum.REMOVE_PRICE;

    UpdateType REMOVE_PRODUCT = UpdateTypeEnum.REMOVE_PRODUCT;

    UpdateType REMOVE_PRODUCT_SELECTION = UpdateTypeEnum.REMOVE_PRODUCT_SELECTION;

    UpdateType REMOVE_PROPERTY = UpdateTypeEnum.REMOVE_PROPERTY;

    UpdateType REMOVE_ROLES = UpdateTypeEnum.REMOVE_ROLES;

    UpdateType REMOVE_SHIPPING_ADDRESS_ID = UpdateTypeEnum.REMOVE_SHIPPING_ADDRESS_ID;

    UpdateType REMOVE_TAX_RATE = UpdateTypeEnum.REMOVE_TAX_RATE;

    UpdateType REMOVE_TEXT_LINE_ITEM = UpdateTypeEnum.REMOVE_TEXT_LINE_ITEM;

    UpdateType REMOVE_VARIANT = UpdateTypeEnum.REMOVE_VARIANT;

    UpdateType REQUEST_QUOTE_RENEGOTIATION = UpdateTypeEnum.REQUEST_QUOTE_RENEGOTIATION;

    UpdateType SET_ADDRESS = UpdateTypeEnum.SET_ADDRESS;

    UpdateType SET_ADDRESS_CUSTOM_FIELD = UpdateTypeEnum.SET_ADDRESS_CUSTOM_FIELD;

    UpdateType SET_ADDRESS_CUSTOM_TYPE = UpdateTypeEnum.SET_ADDRESS_CUSTOM_TYPE;

    UpdateType SET_ANONYMOUS_ID = UpdateTypeEnum.SET_ANONYMOUS_ID;

    UpdateType SET_APPLICATION_VERSION = UpdateTypeEnum.SET_APPLICATION_VERSION;

    UpdateType SET_ASSET_CUSTOM_FIELD = UpdateTypeEnum.SET_ASSET_CUSTOM_FIELD;

    UpdateType SET_ASSET_CUSTOM_TYPE = UpdateTypeEnum.SET_ASSET_CUSTOM_TYPE;

    UpdateType SET_ASSET_DESCRIPTION = UpdateTypeEnum.SET_ASSET_DESCRIPTION;

    UpdateType SET_ASSET_SOURCES = UpdateTypeEnum.SET_ASSET_SOURCES;

    UpdateType SET_ASSET_TAGS = UpdateTypeEnum.SET_ASSET_TAGS;

    UpdateType SET_ASSSET_KEY = UpdateTypeEnum.SET_ASSSET_KEY;

    UpdateType SET_ATTRIBUTE = UpdateTypeEnum.SET_ATTRIBUTE;

    UpdateType SET_AUTHENTICATION_MODE = UpdateTypeEnum.SET_AUTHENTICATION_MODE;

    UpdateType SET_AUTHOR_NAME = UpdateTypeEnum.SET_AUTHOR_NAME;

    UpdateType SET_BILLING_ADDRESS = UpdateTypeEnum.SET_BILLING_ADDRESS;

    UpdateType SET_CART_PREDICATE = UpdateTypeEnum.SET_CART_PREDICATE;

    UpdateType SET_CATEGORY_ORDER_HINT = UpdateTypeEnum.SET_CATEGORY_ORDER_HINT;

    UpdateType SET_COMPANY_NAME = UpdateTypeEnum.SET_COMPANY_NAME;

    UpdateType SET_CONTACT_EMAIL = UpdateTypeEnum.SET_CONTACT_EMAIL;

    UpdateType SET_COUNTRIES = UpdateTypeEnum.SET_COUNTRIES;

    UpdateType SET_COUNTRY = UpdateTypeEnum.SET_COUNTRY;

    UpdateType SET_CUSTOM_FIELD = UpdateTypeEnum.SET_CUSTOM_FIELD;

    UpdateType SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD = UpdateTypeEnum.SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD;

    UpdateType SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE = UpdateTypeEnum.SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE;

    UpdateType SET_CUSTOM_LINE_ITEM_MONEY = UpdateTypeEnum.SET_CUSTOM_LINE_ITEM_MONEY;

    UpdateType SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS = UpdateTypeEnum.SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS;

    UpdateType SET_CUSTOM_LINE_ITEM_TAX_AMOUNT = UpdateTypeEnum.SET_CUSTOM_LINE_ITEM_TAX_AMOUNT;

    UpdateType SET_CUSTOM_LINE_ITEM_TAX_CATEGORY = UpdateTypeEnum.SET_CUSTOM_LINE_ITEM_TAX_CATEGORY;

    UpdateType SET_CUSTOM_LINE_ITEM_TAX_RATE = UpdateTypeEnum.SET_CUSTOM_LINE_ITEM_TAX_RATE;

    UpdateType SET_CUSTOM_LINE_ITEM_TAXED_PRICE = UpdateTypeEnum.SET_CUSTOM_LINE_ITEM_TAXED_PRICE;

    UpdateType SET_CUSTOM_LINE_ITEM_TOTAL_PRICE = UpdateTypeEnum.SET_CUSTOM_LINE_ITEM_TOTAL_PRICE;

    UpdateType SET_CUSTOM_SHIPPING_METHOD = UpdateTypeEnum.SET_CUSTOM_SHIPPING_METHOD;

    UpdateType SET_CUSTOM_TYPE = UpdateTypeEnum.SET_CUSTOM_TYPE;

    UpdateType SET_CUSTOMER = UpdateTypeEnum.SET_CUSTOMER;

    UpdateType SET_CUSTOMER_EMAIL = UpdateTypeEnum.SET_CUSTOMER_EMAIL;

    UpdateType SET_CUSTOMER_GROUP = UpdateTypeEnum.SET_CUSTOMER_GROUP;

    UpdateType SET_CUSTOMER_ID = UpdateTypeEnum.SET_CUSTOMER_ID;

    UpdateType SET_CUSTOMER_NUMBER = UpdateTypeEnum.SET_CUSTOMER_NUMBER;

    UpdateType SET_DATE_OF_BIRTH = UpdateTypeEnum.SET_DATE_OF_BIRTH;

    UpdateType SET_DEFAULT_BILLING_ADDRESS = UpdateTypeEnum.SET_DEFAULT_BILLING_ADDRESS;

    UpdateType SET_DEFAULT_SHIPPING_ADDRESS = UpdateTypeEnum.SET_DEFAULT_SHIPPING_ADDRESS;

    UpdateType SET_DELETE_DAYS_AFTER_LAST_MODIFICATION = UpdateTypeEnum.SET_DELETE_DAYS_AFTER_LAST_MODIFICATION;

    UpdateType SET_DELIVERY_ADDRESS = UpdateTypeEnum.SET_DELIVERY_ADDRESS;

    UpdateType SET_DELIVERY_ITEMS = UpdateTypeEnum.SET_DELIVERY_ITEMS;

    UpdateType SET_DESCRIPTION = UpdateTypeEnum.SET_DESCRIPTION;

    UpdateType SET_DISCOUNTED_PRICE = UpdateTypeEnum.SET_DISCOUNTED_PRICE;

    UpdateType SET_DISTRIBUTION_CHANNELS = UpdateTypeEnum.SET_DISTRIBUTION_CHANNELS;

    UpdateType SET_EXPECTED_DELIVERY = UpdateTypeEnum.SET_EXPECTED_DELIVERY;

    UpdateType SET_EXTERNAL_ID = UpdateTypeEnum.SET_EXTERNAL_ID;

    UpdateType SET_FIRST_NAME = UpdateTypeEnum.SET_FIRST_NAME;

    UpdateType SET_GEO_LOCATION = UpdateTypeEnum.SET_GEO_LOCATION;

    UpdateType SET_IMAGE_LABEL = UpdateTypeEnum.SET_IMAGE_LABEL;

    UpdateType SET_INPUT_TIP = UpdateTypeEnum.SET_INPUT_TIP;

    UpdateType SET_INTERFACE_ID = UpdateTypeEnum.SET_INTERFACE_ID;

    UpdateType SET_IS_VALID = UpdateTypeEnum.SET_IS_VALID;

    UpdateType SET_KEY = UpdateTypeEnum.SET_KEY;

    UpdateType SET_LANGUAGES = UpdateTypeEnum.SET_LANGUAGES;

    UpdateType SET_LAST_NAME = UpdateTypeEnum.SET_LAST_NAME;

    UpdateType SET_LINE_ITEM_CUSTOM_FIELD = UpdateTypeEnum.SET_LINE_ITEM_CUSTOM_FIELD;

    UpdateType SET_LINE_ITEM_CUSTOM_TYPE = UpdateTypeEnum.SET_LINE_ITEM_CUSTOM_TYPE;

    UpdateType SET_LINE_ITEM_DEACTIVATED_AT = UpdateTypeEnum.SET_LINE_ITEM_DEACTIVATED_AT;

    UpdateType SET_LINE_ITEM_DISCOUNTED_PRICE = UpdateTypeEnum.SET_LINE_ITEM_DISCOUNTED_PRICE;

    UpdateType SET_LINE_ITEM_DISCOUNTED_PRICE_PER_QUANTITY = UpdateTypeEnum.SET_LINE_ITEM_DISCOUNTED_PRICE_PER_QUANTITY;

    UpdateType SET_LINE_ITEM_DISTRIBUTION_CHANNEL = UpdateTypeEnum.SET_LINE_ITEM_DISTRIBUTION_CHANNEL;

    UpdateType SET_LINE_ITEM_PRICE = UpdateTypeEnum.SET_LINE_ITEM_PRICE;

    UpdateType SET_LINE_ITEM_PRODUCT_KEY = UpdateTypeEnum.SET_LINE_ITEM_PRODUCT_KEY;

    UpdateType SET_LINE_ITEM_PRODUCT_SLUG = UpdateTypeEnum.SET_LINE_ITEM_PRODUCT_SLUG;

    UpdateType SET_LINE_ITEM_SHIPPING_DETAILS = UpdateTypeEnum.SET_LINE_ITEM_SHIPPING_DETAILS;

    UpdateType SET_LINE_ITEM_TAX_AMOUNT = UpdateTypeEnum.SET_LINE_ITEM_TAX_AMOUNT;

    UpdateType SET_LINE_ITEM_TAX_RATE = UpdateTypeEnum.SET_LINE_ITEM_TAX_RATE;

    UpdateType SET_LINE_ITEM_TAXED_PRICE = UpdateTypeEnum.SET_LINE_ITEM_TAXED_PRICE;

    UpdateType SET_LINE_ITEM_TOTAL_PRICE = UpdateTypeEnum.SET_LINE_ITEM_TOTAL_PRICE;

    UpdateType SET_LOCALE = UpdateTypeEnum.SET_LOCALE;

    UpdateType SET_MAX_APPLICATIONS = UpdateTypeEnum.SET_MAX_APPLICATIONS;

    UpdateType SET_MAX_APPLICATIONS_PER_CUSTOMER = UpdateTypeEnum.SET_MAX_APPLICATIONS_PER_CUSTOMER;

    UpdateType SET_META_DESCRIPTION = UpdateTypeEnum.SET_META_DESCRIPTION;

    UpdateType SET_META_KEYWORDS = UpdateTypeEnum.SET_META_KEYWORDS;

    UpdateType SET_META_TITLE = UpdateTypeEnum.SET_META_TITLE;

    UpdateType SET_METHOD_INFO_INTERFACE = UpdateTypeEnum.SET_METHOD_INFO_INTERFACE;

    UpdateType SET_METHOD_INFO_METHOD = UpdateTypeEnum.SET_METHOD_INFO_METHOD;

    UpdateType SET_METHOD_INFO_NAME = UpdateTypeEnum.SET_METHOD_INFO_NAME;

    UpdateType SET_MIDDLE_NAME = UpdateTypeEnum.SET_MIDDLE_NAME;

    UpdateType SET_NAME = UpdateTypeEnum.SET_NAME;

    UpdateType SET_ORDER_NUMBER = UpdateTypeEnum.SET_ORDER_NUMBER;

    UpdateType SET_ORDER_TAXED_PRICE = UpdateTypeEnum.SET_ORDER_TAXED_PRICE;

    UpdateType SET_ORDER_TOTAL_PRICE = UpdateTypeEnum.SET_ORDER_TOTAL_PRICE;

    UpdateType SET_ORDER_TOTAL_TAX = UpdateTypeEnum.SET_ORDER_TOTAL_TAX;

    UpdateType SET_PARCEL_ITEMS = UpdateTypeEnum.SET_PARCEL_ITEMS;

    UpdateType SET_PARCEL_MEASUREMENTS = UpdateTypeEnum.SET_PARCEL_MEASUREMENTS;

    UpdateType SET_PARCEL_TRACKING_DATA = UpdateTypeEnum.SET_PARCEL_TRACKING_DATA;

    UpdateType SET_PASSWORD = UpdateTypeEnum.SET_PASSWORD;

    UpdateType SET_PRICES = UpdateTypeEnum.SET_PRICES;

    UpdateType SET_PRODUCT_COUNT = UpdateTypeEnum.SET_PRODUCT_COUNT;

    UpdateType SET_PRODUCT_PRICE_CUSTOM_FIELD = UpdateTypeEnum.SET_PRODUCT_PRICE_CUSTOM_FIELD;

    UpdateType SET_PRODUCT_PRICE_CUSTOM_TYPE = UpdateTypeEnum.SET_PRODUCT_PRICE_CUSTOM_TYPE;

    UpdateType SET_PRODUCT_SELECTIONS = UpdateTypeEnum.SET_PRODUCT_SELECTIONS;

    UpdateType SET_PRODUCT_VARIANT_KEY = UpdateTypeEnum.SET_PRODUCT_VARIANT_KEY;

    UpdateType SET_PROPERTY = UpdateTypeEnum.SET_PROPERTY;

    UpdateType SET_PURCHASE_ORDER_NUMBER = UpdateTypeEnum.SET_PURCHASE_ORDER_NUMBER;

    UpdateType SET_RATING = UpdateTypeEnum.SET_RATING;

    UpdateType SET_RESERVATIONS = UpdateTypeEnum.SET_RESERVATIONS;

    UpdateType SET_RESTOCKABLE_IN_DAYS = UpdateTypeEnum.SET_RESTOCKABLE_IN_DAYS;

    UpdateType SET_RETURN_PAYMENT_STATE = UpdateTypeEnum.SET_RETURN_PAYMENT_STATE;

    UpdateType SET_RETURN_SHIPMENT_STATE = UpdateTypeEnum.SET_RETURN_SHIPMENT_STATE;

    UpdateType SET_ROLES = UpdateTypeEnum.SET_ROLES;

    UpdateType SET_SALUTATION = UpdateTypeEnum.SET_SALUTATION;

    UpdateType SET_SEARCH_KEYWORDS = UpdateTypeEnum.SET_SEARCH_KEYWORDS;

    UpdateType SET_SELLER_COMMENT = UpdateTypeEnum.SET_SELLER_COMMENT;

    UpdateType SET_SHIPPING_ADDRESS = UpdateTypeEnum.SET_SHIPPING_ADDRESS;

    UpdateType SET_SHIPPING_INFO_PRICE = UpdateTypeEnum.SET_SHIPPING_INFO_PRICE;

    UpdateType SET_SHIPPING_INFO_TAXED_PRICE = UpdateTypeEnum.SET_SHIPPING_INFO_TAXED_PRICE;

    UpdateType SET_SHIPPING_METHOD = UpdateTypeEnum.SET_SHIPPING_METHOD;

    UpdateType SET_SHIPPING_METHOD_TAX_AMOUNT = UpdateTypeEnum.SET_SHIPPING_METHOD_TAX_AMOUNT;

    UpdateType SET_SHIPPING_METHOD_TAX_RATE = UpdateTypeEnum.SET_SHIPPING_METHOD_TAX_RATE;

    UpdateType SET_SHIPPING_RATE = UpdateTypeEnum.SET_SHIPPING_RATE;

    UpdateType SET_SHIPPING_RATE_INPUT = UpdateTypeEnum.SET_SHIPPING_RATE_INPUT;

    UpdateType SET_SKU = UpdateTypeEnum.SET_SKU;

    UpdateType SET_SLUG = UpdateTypeEnum.SET_SLUG;

    UpdateType SET_STATUS_INTERFACE_CODE = UpdateTypeEnum.SET_STATUS_INTERFACE_CODE;

    UpdateType SET_STATUS_INTERFACE_TEXT = UpdateTypeEnum.SET_STATUS_INTERFACE_TEXT;

    UpdateType SET_STORE = UpdateTypeEnum.SET_STORE;

    UpdateType SET_STORE_MODE = UpdateTypeEnum.SET_STORE_MODE;

    UpdateType SET_STORES = UpdateTypeEnum.SET_STORES;

    UpdateType SET_SUPPLY_CHANNEL = UpdateTypeEnum.SET_SUPPLY_CHANNEL;

    UpdateType SET_SUPPLY_CHANNELS = UpdateTypeEnum.SET_SUPPLY_CHANNELS;

    UpdateType SET_TARGET = UpdateTypeEnum.SET_TARGET;

    UpdateType SET_TAX_CATEGORY = UpdateTypeEnum.SET_TAX_CATEGORY;

    UpdateType SET_TEXT = UpdateTypeEnum.SET_TEXT;

    UpdateType SET_TEXT_LINE_ITEM_CUSTOM_FIELD = UpdateTypeEnum.SET_TEXT_LINE_ITEM_CUSTOM_FIELD;

    UpdateType SET_TEXT_LINE_ITEM_CUSTOM_TYPE = UpdateTypeEnum.SET_TEXT_LINE_ITEM_CUSTOM_TYPE;

    UpdateType SET_TEXT_LINE_ITEM_DESCRIPTION = UpdateTypeEnum.SET_TEXT_LINE_ITEM_DESCRIPTION;

    UpdateType SET_TITLE = UpdateTypeEnum.SET_TITLE;

    UpdateType SET_TRANSITIONS = UpdateTypeEnum.SET_TRANSITIONS;

    UpdateType SET_VALID_FROM = UpdateTypeEnum.SET_VALID_FROM;

    UpdateType SET_VALID_FROM_AND_UNTIL = UpdateTypeEnum.SET_VALID_FROM_AND_UNTIL;

    UpdateType SET_VALID_TO = UpdateTypeEnum.SET_VALID_TO;

    UpdateType SET_VALID_UNTIL = UpdateTypeEnum.SET_VALID_UNTIL;

    UpdateType SET_VALUE = UpdateTypeEnum.SET_VALUE;

    UpdateType SET_VARIANT_AVAILABILITY = UpdateTypeEnum.SET_VARIANT_AVAILABILITY;

    UpdateType SET_VARIANT_SELECTION = UpdateTypeEnum.SET_VARIANT_SELECTION;

    UpdateType SET_VAT_ID = UpdateTypeEnum.SET_VAT_ID;

    UpdateType TRANSITION_CUSTOM_LINE_ITEM_STATE = UpdateTypeEnum.TRANSITION_CUSTOM_LINE_ITEM_STATE;

    UpdateType TRANSITION_LINE_ITEM_STATE = UpdateTypeEnum.TRANSITION_LINE_ITEM_STATE;

    UpdateType TRANSITION_STATE = UpdateTypeEnum.TRANSITION_STATE;

    UpdateType UNPUBLISH = UpdateTypeEnum.UNPUBLISH;

    UpdateType UPDATE_ITEM_SHIPPING_ADDRESS = UpdateTypeEnum.UPDATE_ITEM_SHIPPING_ADDRESS;

    UpdateType UPDATE_SYNC_INFO = UpdateTypeEnum.UPDATE_SYNC_INFO;

    UpdateType VERIFY_EMAIL = UpdateTypeEnum.VERIFY_EMAIL;

    /**
     * possible values of UpdateType
     */
    enum UpdateTypeEnum implements UpdateType {
        /**
         * addAddress
         */
        ADD_ADDRESS("addAddress"),

        /**
         * addAsset
         */
        ADD_ASSET("addAsset"),

        /**
         * addAssociate
         */
        ADD_ASSOCIATE("addAssociate"),

        /**
         * addAttributeDefinition
         */
        ADD_ATTRIBUTE_DEFINITION("addAttributeDefinition"),

        /**
         * addBillingAddressId
         */
        ADD_BILLING_ADDRESS_ID("addBillingAddressId"),

        /**
         * addCustomLineItem
         */
        ADD_CUSTOM_LINE_ITEM("addCustomLineItem"),

        /**
         * addDelivery
         */
        ADD_DELIVERY("addDelivery"),

        /**
         * addDiscountCode
         */
        ADD_DISCOUNT_CODE("addDiscountCode"),

        /**
         * addEnumValue
         */
        ADD_ENUM_VALUE("addEnumValue"),

        /**
         * addExternalImage
         */
        ADD_EXTERNAL_IMAGE("addExternalImage"),

        /**
         * addFieldDefinition
         */
        ADD_FIELD_DEFINITION("addFieldDefinition"),

        /**
         * addInterfaceInteraction
         */
        ADD_INTERFACE_INTERACTION("addInterfaceInteraction"),

        /**
         * addItemShippingAddress
         */
        ADD_ITEM_SHIPPING_ADDRESS("addItemShippingAddress"),

        /**
         * addLineItem
         */
        ADD_LINE_ITEM("addLineItem"),

        /**
         * addLocalizedEnumValue
         */
        ADD_LOCALIZED_ENUM_VALUE("addLocalizedEnumValue"),

        /**
         * addLocation
         */
        ADD_LOCATION("addLocation"),

        /**
         * addParcelToDelivery
         */
        ADD_PARCEL_TO_DELIVERY("addParcelToDelivery"),

        /**
         * addPayment
         */
        ADD_PAYMENT("addPayment"),

        /**
         * addPlainEnumValue
         */
        ADD_PLAIN_ENUM_VALUE("addPlainEnumValue"),

        /**
         * addPrice
         */
        ADD_PRICE("addPrice"),

        /**
         * addProduct
         */
        ADD_PRODUCT("addProduct"),

        /**
         * addProductSelection
         */
        ADD_PRODUCT_SELECTION("addProductSelection"),

        /**
         * addProperty
         */
        ADD_PROPERTY("addProperty"),

        /**
         * addReturnInfo
         */
        ADD_RETURN_INFO("addReturnInfo"),

        /**
         * addRoles
         */
        ADD_ROLES("addRoles"),

        /**
         * addShippingAddressId
         */
        ADD_SHIPPING_ADDRESS_ID("addShippingAddressId"),

        /**
         * addTaxRate
         */
        ADD_TAX_RATE("addTaxRate"),

        /**
         * addTextLineItem
         */
        ADD_TEXT_LINE_ITEM("addTextLineItem"),

        /**
         * addToCategory
         */
        ADD_TO_CATEGORY("addToCategory"),

        /**
         * addTransaction
         */
        ADD_TRANSACTION("addTransaction"),

        /**
         * addVariant
         */
        ADD_VARIANT("addVariant"),

        /**
         * changeAddress
         */
        CHANGE_ADDRESS("changeAddress"),

        /**
         * changeAmountAuthorized
         */
        CHANGE_AMOUNT_AUTHORIZED("changeAmountAuthorized"),

        /**
         * changeAmountPlanned
         */
        CHANGE_AMOUNT_PLANNED("changeAmountPlanned"),

        /**
         * changeAssetName
         */
        CHANGE_ASSET_NAME("changeAssetName"),

        /**
         * changeAssetOrder
         */
        CHANGE_ASSET_ORDER("changeAssetOrder"),

        /**
         * changeAssociate
         */
        CHANGE_ASSOCIATE("changeAssociate"),

        /**
         * changeAssociateMode
         */
        CHANGE_ASSOCIATE_MODE("changeAssociateMode"),

        /**
         * changeAttributeConstraint
         */
        CHANGE_ATTRIBUTE_CONSTRAINT("changeAttributeConstraint"),

        /**
         * changeAttributeName
         */
        CHANGE_ATTRIBUTE_NAME("changeAttributeName"),

        /**
         * changeAttributeOrderByName
         */
        CHANGE_ATTRIBUTE_ORDER_BY_NAME("changeAttributeOrderByName"),

        /**
         * changeCartDiscounts
         */
        CHANGE_CART_DISCOUNTS("changeCartDiscounts"),

        /**
         * changeCartPredicate
         */
        CHANGE_CART_PREDICATE("changeCartPredicate"),

        /**
         * changeCustomLineItemQuantity
         */
        CHANGE_CUSTOM_LINE_ITEM_QUANTITY("changeCustomLineItemQuantity"),

        /**
         * changeDescription
         */
        CHANGE_DESCRIPTION("changeDescription"),

        /**
         * changeEmail
         */
        CHANGE_EMAIL("changeEmail"),

        /**
         * changeEnumKey
         */
        CHANGE_ENUM_KEY("changeEnumKey"),

        /**
         * changeEnumValueLabel
         */
        CHANGE_ENUM_VALUE_LABEL("changeEnumValueLabel"),

        /**
         * changeEnumValueOrder
         */
        CHANGE_ENUM_VALUE_ORDER("changeEnumValueOrder"),

        /**
         * changeFieldDefinitionOrder
         */
        CHANGE_FIELD_DEFINITION_ORDER("changeFieldDefinitionOrder"),

        /**
         * changeGroups
         */
        CHANGE_GROUPS("changeGroups"),

        /**
         * changeInitial
         */
        CHANGE_INITIAL("changeInitial"),

        /**
         * changeInputHint
         */
        CHANGE_INPUT_HINT("changeInputHint"),

        /**
         * changeIsActive
         */
        CHANGE_IS_ACTIVE("changeIsActive"),

        /**
         * changeIsSearchable
         */
        CHANGE_IS_SEARCHABLE("changeIsSearchable"),

        /**
         * changeKey
         */
        CHANGE_KEY("changeKey"),

        /**
         * changeLabel
         */
        CHANGE_LABEL("changeLabel"),

        /**
         * changeLineItemName
         */
        CHANGE_LINE_ITEM_NAME("changeLineItemName"),

        /**
         * changeLineItemQuantity
         */
        CHANGE_LINE_ITEM_QUANTITY("changeLineItemQuantity"),

        /**
         * changeLineItemsOrder
         */
        CHANGE_LINE_ITEMS_ORDER("changeLineItemsOrder"),

        /**
         * changeLocalizedEnumValueLabel
         */
        CHANGE_LOCALIZED_ENUM_VALUE_LABEL("changeLocalizedEnumValueLabel"),

        /**
         * changeLocalizedEnumValueOrder
         */
        CHANGE_LOCALIZED_ENUM_VALUE_ORDER("changeLocalizedEnumValueOrder"),

        /**
         * changeMasterVariant
         */
        CHANGE_MASTER_VARIANT("changeMasterVariant"),

        /**
         * changeName
         */
        CHANGE_NAME("changeName"),

        /**
         * changeOrderHint
         */
        CHANGE_ORDER_HINT("changeOrderHint"),

        /**
         * changeOrderState
         */
        CHANGE_ORDER_STATE("changeOrderState"),

        /**
         * changeParent
         */
        CHANGE_PARENT("changeParent"),

        /**
         * changeParentUnit
         */
        CHANGE_PARENT_UNIT("changeParentUnit"),

        /**
         * changePaymentState
         */
        CHANGE_PAYMENT_STATE("changePaymentState"),

        /**
         * changePlainEnumValueLabel
         */
        CHANGE_PLAIN_ENUM_VALUE_LABEL("changePlainEnumValueLabel"),

        /**
         * changePredicate
         */
        CHANGE_PREDICATE("changePredicate"),

        /**
         * changePrice
         */
        CHANGE_PRICE("changePrice"),

        /**
         * changeProductSelectionActive
         */
        CHANGE_PRODUCT_SELECTION_ACTIVE("changeProductSelectionActive"),

        /**
         * changeQuantity
         */
        CHANGE_QUANTITY("changeQuantity"),

        /**
         * changeQuoteRequestState
         */
        CHANGE_QUOTE_REQUEST_STATE("changeQuoteRequestState"),

        /**
         * changeQuoteState
         */
        CHANGE_QUOTE_STATE("changeQuoteState"),

        /**
         * changeRequiresDiscountCode
         */
        CHANGE_REQUIRES_DISCOUNT_CODE("changeRequiresDiscountCode"),

        /**
         * changeReviewRatingStatistics
         */
        CHANGE_REVIEW_RATING_STATISTICS("changeReviewRatingStatistics"),

        /**
         * changeShipmentState
         */
        CHANGE_SHIPMENT_STATE("changeShipmentState"),

        /**
         * changeSlug
         */
        CHANGE_SLUG("changeSlug"),

        /**
         * changeSortOrder
         */
        CHANGE_SORT_ORDER("changeSortOrder"),

        /**
         * changeStackingMode
         */
        CHANGE_STACKING_MODE("changeStackingMode"),

        /**
         * changeStagedQuoteState
         */
        CHANGE_STAGED_QUOTE_STATE("changeStagedQuoteState"),

        /**
         * changeStatus
         */
        CHANGE_STATUS("changeStatus"),

        /**
         * changeTarget
         */
        CHANGE_TARGET("changeTarget"),

        /**
         * changeTaxCalculationMode
         */
        CHANGE_TAX_CALCULATION_MODE("changeTaxCalculationMode"),

        /**
         * changeTaxMode
         */
        CHANGE_TAX_MODE("changeTaxMode"),

        /**
         * changeTaxRoundingMode
         */
        CHANGE_TAX_ROUNDING_MODE("changeTaxRoundingMode"),

        /**
         * changeTextLineItemName
         */
        CHANGE_TEXT_LINE_ITEM_NAME("changeTextLineItemName"),

        /**
         * changeTextLineItemQuantity
         */
        CHANGE_TEXT_LINE_ITEM_QUANTITY("changeTextLineItemQuantity"),

        /**
         * changeTextLineItemsOrder
         */
        CHANGE_TEXT_LINE_ITEMS_ORDER("changeTextLineItemsOrder"),

        /**
         * changeTransactionInteractionId
         */
        CHANGE_TRANSACTION_INTERACTION_ID("changeTransactionInteractionId"),

        /**
         * changeTransactionState
         */
        CHANGE_TRANSACTION_STATE("changeTransactionState"),

        /**
         * changeTransactionTimestamp
         */
        CHANGE_TRANSACTION_TIMESTAMP("changeTransactionTimestamp"),

        /**
         * changeType
         */
        CHANGE_TYPE("changeType"),

        /**
         * changeValue
         */
        CHANGE_VALUE("changeValue"),

        /**
         * moveImageToPosition
         */
        MOVE_IMAGE_TO_POSITION("moveImageToPosition"),

        /**
         * publish
         */
        PUBLISH("publish"),

        /**
         * removeAddress
         */
        REMOVE_ADDRESS("removeAddress"),

        /**
         * removeAsset
         */
        REMOVE_ASSET("removeAsset"),

        /**
         * removeAssociate
         */
        REMOVE_ASSOCIATE("removeAssociate"),

        /**
         * removeAttributeDefinition
         */
        REMOVE_ATTRIBUTE_DEFINITION("removeAttributeDefinition"),

        /**
         * removeBillingAddressId
         */
        REMOVE_BILLING_ADDRESS_ID("removeBillingAddressId"),

        /**
         * removeCustomLineItem
         */
        REMOVE_CUSTOM_LINE_ITEM("removeCustomLineItem"),

        /**
         * removeDelivery
         */
        REMOVE_DELIVERY("removeDelivery"),

        /**
         * removeDiscountCode
         */
        REMOVE_DISCOUNT_CODE("removeDiscountCode"),

        /**
         * removeEnumValues
         */
        REMOVE_ENUM_VALUES("removeEnumValues"),

        /**
         * removeFieldDefinition
         */
        REMOVE_FIELD_DEFINITION("removeFieldDefinition"),

        /**
         * removeFromCategory
         */
        REMOVE_FROM_CATEGORY("removeFromCategory"),

        /**
         * removeImage
         */
        REMOVE_IMAGE("removeImage"),

        /**
         * removeItemShippingAddress
         */
        REMOVE_ITEM_SHIPPING_ADDRESS("removeItemShippingAddress"),

        /**
         * removeLineItem
         */
        REMOVE_LINE_ITEM("removeLineItem"),

        /**
         * removeLocation
         */
        REMOVE_LOCATION("removeLocation"),

        /**
         * removeParcelFromDelivery
         */
        REMOVE_PARCEL_FROM_DELIVERY("removeParcelFromDelivery"),

        /**
         * removePayment
         */
        REMOVE_PAYMENT("removePayment"),

        /**
         * removePrice
         */
        REMOVE_PRICE("removePrice"),

        /**
         * removeProduct
         */
        REMOVE_PRODUCT("removeProduct"),

        /**
         * removeProductSelection
         */
        REMOVE_PRODUCT_SELECTION("removeProductSelection"),

        /**
         * removeProperty
         */
        REMOVE_PROPERTY("removeProperty"),

        /**
         * removeRoles
         */
        REMOVE_ROLES("removeRoles"),

        /**
         * removeShippingAddressId
         */
        REMOVE_SHIPPING_ADDRESS_ID("removeShippingAddressId"),

        /**
         * removeTaxRate
         */
        REMOVE_TAX_RATE("removeTaxRate"),

        /**
         * removeTextLineItem
         */
        REMOVE_TEXT_LINE_ITEM("removeTextLineItem"),

        /**
         * removeVariant
         */
        REMOVE_VARIANT("removeVariant"),

        /**
         * requestQuoteRenegotiation
         */
        REQUEST_QUOTE_RENEGOTIATION("requestQuoteRenegotiation"),

        /**
         * setAddress
         */
        SET_ADDRESS("setAddress"),

        /**
         * setAddressCustomField
         */
        SET_ADDRESS_CUSTOM_FIELD("setAddressCustomField"),

        /**
         * setAddressCustomType
         */
        SET_ADDRESS_CUSTOM_TYPE("setAddressCustomType"),

        /**
         * setAnonymousId
         */
        SET_ANONYMOUS_ID("setAnonymousId"),

        /**
         * setApplicationVersion
         */
        SET_APPLICATION_VERSION("setApplicationVersion"),

        /**
         * setAssetCustomField
         */
        SET_ASSET_CUSTOM_FIELD("setAssetCustomField"),

        /**
         * setAssetCustomType
         */
        SET_ASSET_CUSTOM_TYPE("setAssetCustomType"),

        /**
         * setAssetDescription
         */
        SET_ASSET_DESCRIPTION("setAssetDescription"),

        /**
         * setAssetSources
         */
        SET_ASSET_SOURCES("setAssetSources"),

        /**
         * setAssetTags
         */
        SET_ASSET_TAGS("setAssetTags"),

        /**
         * setAsssetKey
         */
        SET_ASSSET_KEY("setAsssetKey"),

        /**
         * setAttribute
         */
        SET_ATTRIBUTE("setAttribute"),

        /**
         * setAuthenticationMode
         */
        SET_AUTHENTICATION_MODE("setAuthenticationMode"),

        /**
         * setAuthorName
         */
        SET_AUTHOR_NAME("setAuthorName"),

        /**
         * setBillingAddress
         */
        SET_BILLING_ADDRESS("setBillingAddress"),

        /**
         * setCartPredicate
         */
        SET_CART_PREDICATE("setCartPredicate"),

        /**
         * setCategoryOrderHint
         */
        SET_CATEGORY_ORDER_HINT("setCategoryOrderHint"),

        /**
         * setCompanyName
         */
        SET_COMPANY_NAME("setCompanyName"),

        /**
         * setContactEmail
         */
        SET_CONTACT_EMAIL("setContactEmail"),

        /**
         * setCountries
         */
        SET_COUNTRIES("setCountries"),

        /**
         * setCountry
         */
        SET_COUNTRY("setCountry"),

        /**
         * setCustomField
         */
        SET_CUSTOM_FIELD("setCustomField"),

        /**
         * setCustomLineItemCustomField
         */
        SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD("setCustomLineItemCustomField"),

        /**
         * setCustomLineItemCustomType
         */
        SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE("setCustomLineItemCustomType"),

        /**
         * setCustomLineItemMoney
         */
        SET_CUSTOM_LINE_ITEM_MONEY("setCustomLineItemMoney"),

        /**
         * setCustomLineItemShippingDetails
         */
        SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS("setCustomLineItemShippingDetails"),

        /**
         * setCustomLineItemTaxAmount
         */
        SET_CUSTOM_LINE_ITEM_TAX_AMOUNT("setCustomLineItemTaxAmount"),

        /**
         * setCustomLineItemTaxCategory
         */
        SET_CUSTOM_LINE_ITEM_TAX_CATEGORY("setCustomLineItemTaxCategory"),

        /**
         * setCustomLineItemTaxRate
         */
        SET_CUSTOM_LINE_ITEM_TAX_RATE("setCustomLineItemTaxRate"),

        /**
         * setCustomLineItemTaxedPrice
         */
        SET_CUSTOM_LINE_ITEM_TAXED_PRICE("setCustomLineItemTaxedPrice"),

        /**
         * setCustomLineItemTotalPrice
         */
        SET_CUSTOM_LINE_ITEM_TOTAL_PRICE("setCustomLineItemTotalPrice"),

        /**
         * setCustomShippingMethod
         */
        SET_CUSTOM_SHIPPING_METHOD("setCustomShippingMethod"),

        /**
         * setCustomType
         */
        SET_CUSTOM_TYPE("setCustomType"),

        /**
         * setCustomer
         */
        SET_CUSTOMER("setCustomer"),

        /**
         * setCustomerEmail
         */
        SET_CUSTOMER_EMAIL("setCustomerEmail"),

        /**
         * setCustomerGroup
         */
        SET_CUSTOMER_GROUP("setCustomerGroup"),

        /**
         * setCustomerId
         */
        SET_CUSTOMER_ID("setCustomerId"),

        /**
         * setCustomerNumber
         */
        SET_CUSTOMER_NUMBER("setCustomerNumber"),

        /**
         * setDateOfBirth
         */
        SET_DATE_OF_BIRTH("setDateOfBirth"),

        /**
         * setDefaultBillingAddress
         */
        SET_DEFAULT_BILLING_ADDRESS("setDefaultBillingAddress"),

        /**
         * setDefaultShippingAddress
         */
        SET_DEFAULT_SHIPPING_ADDRESS("setDefaultShippingAddress"),

        /**
         * setDeleteDaysAfterLastModification
         */
        SET_DELETE_DAYS_AFTER_LAST_MODIFICATION("setDeleteDaysAfterLastModification"),

        /**
         * setDeliveryAddress
         */
        SET_DELIVERY_ADDRESS("setDeliveryAddress"),

        /**
         * setDeliveryItems
         */
        SET_DELIVERY_ITEMS("setDeliveryItems"),

        /**
         * setDescription
         */
        SET_DESCRIPTION("setDescription"),

        /**
         * setDiscountedPrice
         */
        SET_DISCOUNTED_PRICE("setDiscountedPrice"),

        /**
         * setDistributionChannels
         */
        SET_DISTRIBUTION_CHANNELS("setDistributionChannels"),

        /**
         * setExpectedDelivery
         */
        SET_EXPECTED_DELIVERY("setExpectedDelivery"),

        /**
         * setExternalId
         */
        SET_EXTERNAL_ID("setExternalId"),

        /**
         * setFirstName
         */
        SET_FIRST_NAME("setFirstName"),

        /**
         * setGeoLocation
         */
        SET_GEO_LOCATION("setGeoLocation"),

        /**
         * setImageLabel
         */
        SET_IMAGE_LABEL("setImageLabel"),

        /**
         * setInputTip
         */
        SET_INPUT_TIP("setInputTip"),

        /**
         * setInterfaceId
         */
        SET_INTERFACE_ID("setInterfaceId"),

        /**
         * setIsValid
         */
        SET_IS_VALID("setIsValid"),

        /**
         * setKey
         */
        SET_KEY("setKey"),

        /**
         * setLanguages
         */
        SET_LANGUAGES("setLanguages"),

        /**
         * setLastName
         */
        SET_LAST_NAME("setLastName"),

        /**
         * setLineItemCustomField
         */
        SET_LINE_ITEM_CUSTOM_FIELD("setLineItemCustomField"),

        /**
         * setLineItemCustomType
         */
        SET_LINE_ITEM_CUSTOM_TYPE("setLineItemCustomType"),

        /**
         * setLineItemDeactivatedAt
         */
        SET_LINE_ITEM_DEACTIVATED_AT("setLineItemDeactivatedAt"),

        /**
         * setLineItemDiscountedPrice
         */
        SET_LINE_ITEM_DISCOUNTED_PRICE("setLineItemDiscountedPrice"),

        /**
         * setLineItemDiscountedPricePerQuantity
         */
        SET_LINE_ITEM_DISCOUNTED_PRICE_PER_QUANTITY("setLineItemDiscountedPricePerQuantity"),

        /**
         * setLineItemDistributionChannel
         */
        SET_LINE_ITEM_DISTRIBUTION_CHANNEL("setLineItemDistributionChannel"),

        /**
         * setLineItemPrice
         */
        SET_LINE_ITEM_PRICE("setLineItemPrice"),

        /**
         * setLineItemProductKey
         */
        SET_LINE_ITEM_PRODUCT_KEY("setLineItemProductKey"),

        /**
         * setLineItemProductSlug
         */
        SET_LINE_ITEM_PRODUCT_SLUG("setLineItemProductSlug"),

        /**
         * setLineItemShippingDetails
         */
        SET_LINE_ITEM_SHIPPING_DETAILS("setLineItemShippingDetails"),

        /**
         * setLineItemTaxAmount
         */
        SET_LINE_ITEM_TAX_AMOUNT("setLineItemTaxAmount"),

        /**
         * setLineItemTaxRate
         */
        SET_LINE_ITEM_TAX_RATE("setLineItemTaxRate"),

        /**
         * setLineItemTaxedPrice
         */
        SET_LINE_ITEM_TAXED_PRICE("setLineItemTaxedPrice"),

        /**
         * setLineItemTotalPrice
         */
        SET_LINE_ITEM_TOTAL_PRICE("setLineItemTotalPrice"),

        /**
         * setLocale
         */
        SET_LOCALE("setLocale"),

        /**
         * setMaxApplications
         */
        SET_MAX_APPLICATIONS("setMaxApplications"),

        /**
         * setMaxApplicationsPerCustomer
         */
        SET_MAX_APPLICATIONS_PER_CUSTOMER("setMaxApplicationsPerCustomer"),

        /**
         * setMetaDescription
         */
        SET_META_DESCRIPTION("setMetaDescription"),

        /**
         * setMetaKeywords
         */
        SET_META_KEYWORDS("setMetaKeywords"),

        /**
         * setMetaTitle
         */
        SET_META_TITLE("setMetaTitle"),

        /**
         * setMethodInfoInterface
         */
        SET_METHOD_INFO_INTERFACE("setMethodInfoInterface"),

        /**
         * setMethodInfoMethod
         */
        SET_METHOD_INFO_METHOD("setMethodInfoMethod"),

        /**
         * setMethodInfoName
         */
        SET_METHOD_INFO_NAME("setMethodInfoName"),

        /**
         * setMiddleName
         */
        SET_MIDDLE_NAME("setMiddleName"),

        /**
         * setName
         */
        SET_NAME("setName"),

        /**
         * setOrderNumber
         */
        SET_ORDER_NUMBER("setOrderNumber"),

        /**
         * setOrderTaxedPrice
         */
        SET_ORDER_TAXED_PRICE("setOrderTaxedPrice"),

        /**
         * setOrderTotalPrice
         */
        SET_ORDER_TOTAL_PRICE("setOrderTotalPrice"),

        /**
         * setOrderTotalTax
         */
        SET_ORDER_TOTAL_TAX("setOrderTotalTax"),

        /**
         * setParcelItems
         */
        SET_PARCEL_ITEMS("setParcelItems"),

        /**
         * setParcelMeasurements
         */
        SET_PARCEL_MEASUREMENTS("setParcelMeasurements"),

        /**
         * setParcelTrackingData
         */
        SET_PARCEL_TRACKING_DATA("setParcelTrackingData"),

        /**
         * setPassword
         */
        SET_PASSWORD("setPassword"),

        /**
         * setPrices
         */
        SET_PRICES("setPrices"),

        /**
         * setProductCount
         */
        SET_PRODUCT_COUNT("setProductCount"),

        /**
         * setProductPriceCustomField
         */
        SET_PRODUCT_PRICE_CUSTOM_FIELD("setProductPriceCustomField"),

        /**
         * setProductPriceCustomType
         */
        SET_PRODUCT_PRICE_CUSTOM_TYPE("setProductPriceCustomType"),

        /**
         * setProductSelections
         */
        SET_PRODUCT_SELECTIONS("setProductSelections"),

        /**
         * setProductVariantKey
         */
        SET_PRODUCT_VARIANT_KEY("setProductVariantKey"),

        /**
         * setProperty
         */
        SET_PROPERTY("setProperty"),

        /**
         * setPurchaseOrderNumber
         */
        SET_PURCHASE_ORDER_NUMBER("setPurchaseOrderNumber"),

        /**
         * setRating
         */
        SET_RATING("setRating"),

        /**
         * setReservations
         */
        SET_RESERVATIONS("setReservations"),

        /**
         * setRestockableInDays
         */
        SET_RESTOCKABLE_IN_DAYS("setRestockableInDays"),

        /**
         * setReturnPaymentState
         */
        SET_RETURN_PAYMENT_STATE("setReturnPaymentState"),

        /**
         * setReturnShipmentState
         */
        SET_RETURN_SHIPMENT_STATE("setReturnShipmentState"),

        /**
         * setRoles
         */
        SET_ROLES("setRoles"),

        /**
         * setSalutation
         */
        SET_SALUTATION("setSalutation"),

        /**
         * setSearchKeywords
         */
        SET_SEARCH_KEYWORDS("setSearchKeywords"),

        /**
         * setSellerComment
         */
        SET_SELLER_COMMENT("setSellerComment"),

        /**
         * setShippingAddress
         */
        SET_SHIPPING_ADDRESS("setShippingAddress"),

        /**
         * setShippingInfoPrice
         */
        SET_SHIPPING_INFO_PRICE("setShippingInfoPrice"),

        /**
         * setShippingInfoTaxedPrice
         */
        SET_SHIPPING_INFO_TAXED_PRICE("setShippingInfoTaxedPrice"),

        /**
         * setShippingMethod
         */
        SET_SHIPPING_METHOD("setShippingMethod"),

        /**
         * setShippingMethodTaxAmount
         */
        SET_SHIPPING_METHOD_TAX_AMOUNT("setShippingMethodTaxAmount"),

        /**
         * setShippingMethodTaxRate
         */
        SET_SHIPPING_METHOD_TAX_RATE("setShippingMethodTaxRate"),

        /**
         * setShippingRate
         */
        SET_SHIPPING_RATE("setShippingRate"),

        /**
         * setShippingRateInput
         */
        SET_SHIPPING_RATE_INPUT("setShippingRateInput"),

        /**
         * setSku
         */
        SET_SKU("setSku"),

        /**
         * setSlug
         */
        SET_SLUG("setSlug"),

        /**
         * setStatusInterfaceCode
         */
        SET_STATUS_INTERFACE_CODE("setStatusInterfaceCode"),

        /**
         * setStatusInterfaceText
         */
        SET_STATUS_INTERFACE_TEXT("setStatusInterfaceText"),

        /**
         * setStore
         */
        SET_STORE("setStore"),

        /**
         * setStoreMode
         */
        SET_STORE_MODE("setStoreMode"),

        /**
         * setStores
         */
        SET_STORES("setStores"),

        /**
         * setSupplyChannel
         */
        SET_SUPPLY_CHANNEL("setSupplyChannel"),

        /**
         * setSupplyChannels
         */
        SET_SUPPLY_CHANNELS("setSupplyChannels"),

        /**
         * setTarget
         */
        SET_TARGET("setTarget"),

        /**
         * setTaxCategory
         */
        SET_TAX_CATEGORY("setTaxCategory"),

        /**
         * setText
         */
        SET_TEXT("setText"),

        /**
         * setTextLineItemCustomField
         */
        SET_TEXT_LINE_ITEM_CUSTOM_FIELD("setTextLineItemCustomField"),

        /**
         * setTextLineItemCustomType
         */
        SET_TEXT_LINE_ITEM_CUSTOM_TYPE("setTextLineItemCustomType"),

        /**
         * setTextLineItemDescription
         */
        SET_TEXT_LINE_ITEM_DESCRIPTION("setTextLineItemDescription"),

        /**
         * setTitle
         */
        SET_TITLE("setTitle"),

        /**
         * setTransitions
         */
        SET_TRANSITIONS("setTransitions"),

        /**
         * setValidFrom
         */
        SET_VALID_FROM("setValidFrom"),

        /**
         * setValidFromAndUntil
         */
        SET_VALID_FROM_AND_UNTIL("setValidFromAndUntil"),

        /**
         * setValidTo
         */
        SET_VALID_TO("setValidTo"),

        /**
         * setValidUntil
         */
        SET_VALID_UNTIL("setValidUntil"),

        /**
         * setValue
         */
        SET_VALUE("setValue"),

        /**
         * setVariantAvailability
         */
        SET_VARIANT_AVAILABILITY("setVariantAvailability"),

        /**
         * setVariantSelection
         */
        SET_VARIANT_SELECTION("setVariantSelection"),

        /**
         * setVatId
         */
        SET_VAT_ID("setVatId"),

        /**
         * transitionCustomLineItemState
         */
        TRANSITION_CUSTOM_LINE_ITEM_STATE("transitionCustomLineItemState"),

        /**
         * transitionLineItemState
         */
        TRANSITION_LINE_ITEM_STATE("transitionLineItemState"),

        /**
         * transitionState
         */
        TRANSITION_STATE("transitionState"),

        /**
         * unpublish
         */
        UNPUBLISH("unpublish"),

        /**
         * updateItemShippingAddress
         */
        UPDATE_ITEM_SHIPPING_ADDRESS("updateItemShippingAddress"),

        /**
         * updateSyncInfo
         */
        UPDATE_SYNC_INFO("updateSyncInfo"),

        /**
         * verifyEmail
         */
        VERIFY_EMAIL("verifyEmail");
        private final String jsonName;

        private UpdateTypeEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    /**
     * the JSON value
     * @return json value
     */
    @JsonValue
    String getJsonName();

    /**
     * the enum value
     * @return name
     */
    String name();

    /**
     * convert value to string
     * @return string representation
     */
    String toString();

    /**
     * factory method for a enum value of UpdateType
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static UpdateType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new UpdateType() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<UpdateType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static UpdateType[] values() {
        return UpdateTypeEnum.values();
    }

}
