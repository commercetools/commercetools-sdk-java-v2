
package com.commercetools.history.models.change_history;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * UpdateType
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface UpdateType {

    UpdateType ADD_ADDRESS = UpdateTypeEnum.ADD_ADDRESS;

    UpdateType ADD_ASSET = UpdateTypeEnum.ADD_ASSET;

    UpdateType ADD_ATTRIBUTE_DEFINITION = UpdateTypeEnum.ADD_ATTRIBUTE_DEFINITION;

    UpdateType ADD_BILLING_ADDRESS_ID = UpdateTypeEnum.ADD_BILLING_ADDRESS_ID;

    UpdateType ADD_DELIVERY = UpdateTypeEnum.ADD_DELIVERY;

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

    UpdateType ADD_RETURN_INFO = UpdateTypeEnum.ADD_RETURN_INFO;

    UpdateType ADD_ROLES = UpdateTypeEnum.ADD_ROLES;

    UpdateType ADD_SHIPPING_ADDRESS_ID = UpdateTypeEnum.ADD_SHIPPING_ADDRESS_ID;

    UpdateType ADD_TAX_RATE = UpdateTypeEnum.ADD_TAX_RATE;

    UpdateType ADD_TEXT_LINE_ITEM = UpdateTypeEnum.ADD_TEXT_LINE_ITEM;

    UpdateType ADD_TO_CATEGORY = UpdateTypeEnum.ADD_TO_CATEGORY;

    UpdateType ADD_TRANSACTION = UpdateTypeEnum.ADD_TRANSACTION;

    UpdateType ADD_VARIANT = UpdateTypeEnum.ADD_VARIANT;

    UpdateType CHANGE_ADDRESS = UpdateTypeEnum.CHANGE_ADDRESS;

    UpdateType CHANGE_AMOUNT_PLANNED = UpdateTypeEnum.CHANGE_AMOUNT_PLANNED;

    UpdateType CHANGE_ASSET_NAME = UpdateTypeEnum.CHANGE_ASSET_NAME;

    UpdateType CHANGE_ASSET_ORDER = UpdateTypeEnum.CHANGE_ASSET_ORDER;

    UpdateType CHANGE_ATTRIBUTE_CONSTRAINT = UpdateTypeEnum.CHANGE_ATTRIBUTE_CONSTRAINT;

    UpdateType CHANGE_ATTRIBUTE_NAME = UpdateTypeEnum.CHANGE_ATTRIBUTE_NAME;

    UpdateType CHANGE_ATTRIBUTE_ORDER_BY_NAME = UpdateTypeEnum.CHANGE_ATTRIBUTE_ORDER_BY_NAME;

    UpdateType CHANGE_CART_DISCOUNTS = UpdateTypeEnum.CHANGE_CART_DISCOUNTS;

    UpdateType CHANGE_CART_PREDICATE = UpdateTypeEnum.CHANGE_CART_PREDICATE;

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

    UpdateType CHANGE_LINE_ITEM_QUANTITY = UpdateTypeEnum.CHANGE_LINE_ITEM_QUANTITY;

    UpdateType CHANGE_LINE_ITEMS_ORDER = UpdateTypeEnum.CHANGE_LINE_ITEMS_ORDER;

    UpdateType CHANGE_LOCALIZED_ENUM_VALUE_LABEL = UpdateTypeEnum.CHANGE_LOCALIZED_ENUM_VALUE_LABEL;

    UpdateType CHANGE_LOCALIZED_ENUM_VALUE_ORDER = UpdateTypeEnum.CHANGE_LOCALIZED_ENUM_VALUE_ORDER;

    UpdateType CHANGE_MASTER_VARIANT = UpdateTypeEnum.CHANGE_MASTER_VARIANT;

    UpdateType CHANGE_NAME = UpdateTypeEnum.CHANGE_NAME;

    UpdateType CHANGE_ORDER_HINT = UpdateTypeEnum.CHANGE_ORDER_HINT;

    UpdateType CHANGE_ORDER_STATE = UpdateTypeEnum.CHANGE_ORDER_STATE;

    UpdateType CHANGE_PARENT = UpdateTypeEnum.CHANGE_PARENT;

    UpdateType CHANGE_PAYMENT_STATE = UpdateTypeEnum.CHANGE_PAYMENT_STATE;

    UpdateType CHANGE_PLAIN_ENUM_VALUE_LABEL = UpdateTypeEnum.CHANGE_PLAIN_ENUM_VALUE_LABEL;

    UpdateType CHANGE_PREDICATE = UpdateTypeEnum.CHANGE_PREDICATE;

    UpdateType CHANGE_PRICE = UpdateTypeEnum.CHANGE_PRICE;

    UpdateType CHANGE_QUANTITY = UpdateTypeEnum.CHANGE_QUANTITY;

    UpdateType CHANGE_REQUIRES_DISCOUNT_CODE = UpdateTypeEnum.CHANGE_REQUIRES_DISCOUNT_CODE;

    UpdateType CHANGE_REVIEW_RATING_STATISTICS = UpdateTypeEnum.CHANGE_REVIEW_RATING_STATISTICS;

    UpdateType CHANGE_SHIPMENT_STATE = UpdateTypeEnum.CHANGE_SHIPMENT_STATE;

    UpdateType CHANGE_SLUG = UpdateTypeEnum.CHANGE_SLUG;

    UpdateType CHANGE_SORT_ORDER = UpdateTypeEnum.CHANGE_SORT_ORDER;

    UpdateType CHANGE_STACKING_MODE = UpdateTypeEnum.CHANGE_STACKING_MODE;

    UpdateType CHANGE_TARGET = UpdateTypeEnum.CHANGE_TARGET;

    UpdateType CHANGE_TEXT_LINE_ITEM_NAME = UpdateTypeEnum.CHANGE_TEXT_LINE_ITEM_NAME;

    UpdateType CHANGE_TEXT_LINE_ITEM_QUANTITY = UpdateTypeEnum.CHANGE_TEXT_LINE_ITEM_QUANTITY;

    UpdateType CHANGE_TEXT_LINE_ITEMS_ORDER = UpdateTypeEnum.CHANGE_TEXT_LINE_ITEMS_ORDER;

    UpdateType CHANGE_TRANSACTION_INTERACTION_ID = UpdateTypeEnum.CHANGE_TRANSACTION_INTERACTION_ID;

    UpdateType CHANGE_TRANSACTION_STATE = UpdateTypeEnum.CHANGE_TRANSACTION_STATE;

    UpdateType CHANGE_TRANSACTION_TIMESTAMP = UpdateTypeEnum.CHANGE_TRANSACTION_TIMESTAMP;

    UpdateType CHANGE_TYPE = UpdateTypeEnum.CHANGE_TYPE;

    UpdateType CHANGE_VALUE = UpdateTypeEnum.CHANGE_VALUE;

    UpdateType PUBLISH = UpdateTypeEnum.PUBLISH;

    UpdateType REMOVE_ADDRESS = UpdateTypeEnum.REMOVE_ADDRESS;

    UpdateType REMOVE_ASSET = UpdateTypeEnum.REMOVE_ASSET;

    UpdateType REMOVE_ATTRIBUTE_DEFINITION = UpdateTypeEnum.REMOVE_ATTRIBUTE_DEFINITION;

    UpdateType REMOVE_BILLING_ADDRESS_ID = UpdateTypeEnum.REMOVE_BILLING_ADDRESS_ID;

    UpdateType REMOVE_DELIVERY = UpdateTypeEnum.REMOVE_DELIVERY;

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

    UpdateType REMOVE_ROLES = UpdateTypeEnum.REMOVE_ROLES;

    UpdateType REMOVE_SHIPPING_ADDRESS_ID = UpdateTypeEnum.REMOVE_SHIPPING_ADDRESS_ID;

    UpdateType REMOVE_TAX_RATE = UpdateTypeEnum.REMOVE_TAX_RATE;

    UpdateType REMOVE_TEXT_LINE_ITEM = UpdateTypeEnum.REMOVE_TEXT_LINE_ITEM;

    UpdateType REMOVE_VARIANT = UpdateTypeEnum.REMOVE_VARIANT;

    UpdateType SET_ADDRESS = UpdateTypeEnum.SET_ADDRESS;

    UpdateType SET_ANONYMOUS_ID = UpdateTypeEnum.SET_ANONYMOUS_ID;

    UpdateType SET_ASSET_CUSTOM_FIELD = UpdateTypeEnum.SET_ASSET_CUSTOM_FIELD;

    UpdateType SET_ASSET_CUSTOM_TYPE = UpdateTypeEnum.SET_ASSET_CUSTOM_TYPE;

    UpdateType SET_ASSET_DESCRIPTION = UpdateTypeEnum.SET_ASSET_DESCRIPTION;

    UpdateType SET_ASSET_SOURCES = UpdateTypeEnum.SET_ASSET_SOURCES;

    UpdateType SET_ASSET_TAGS = UpdateTypeEnum.SET_ASSET_TAGS;

    UpdateType SET_ASSSET_KEY = UpdateTypeEnum.SET_ASSSET_KEY;

    UpdateType SET_ATTRIBUTE = UpdateTypeEnum.SET_ATTRIBUTE;

    UpdateType SET_AUTHOR_NAME = UpdateTypeEnum.SET_AUTHOR_NAME;

    UpdateType SET_BILLING_ADDRESS = UpdateTypeEnum.SET_BILLING_ADDRESS;

    UpdateType SET_CART_PREDICATE = UpdateTypeEnum.SET_CART_PREDICATE;

    UpdateType SET_CATEGORY_ORDER_HINT = UpdateTypeEnum.SET_CATEGORY_ORDER_HINT;

    UpdateType SET_COMPANY_NAME = UpdateTypeEnum.SET_COMPANY_NAME;

    UpdateType SET_CUSTOM_FIELD = UpdateTypeEnum.SET_CUSTOM_FIELD;

    UpdateType SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD = UpdateTypeEnum.SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD;

    UpdateType SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE = UpdateTypeEnum.SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE;

    UpdateType SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS = UpdateTypeEnum.SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS;

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

    UpdateType SET_KEY = UpdateTypeEnum.SET_KEY;

    UpdateType SET_LANGUAGES = UpdateTypeEnum.SET_LANGUAGES;

    UpdateType SET_LAST_NAME = UpdateTypeEnum.SET_LAST_NAME;

    UpdateType SET_LINE_ITEM_CUSTOM_FIELD = UpdateTypeEnum.SET_LINE_ITEM_CUSTOM_FIELD;

    UpdateType SET_LINE_ITEM_CUSTOM_TYPE = UpdateTypeEnum.SET_LINE_ITEM_CUSTOM_TYPE;

    UpdateType SET_LINE_ITEM_SHIPPING_DETAILS = UpdateTypeEnum.SET_LINE_ITEM_SHIPPING_DETAILS;

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

    UpdateType SET_PARCEL_ITEMS = UpdateTypeEnum.SET_PARCEL_ITEMS;

    UpdateType SET_PARCEL_MEASUREMENTS = UpdateTypeEnum.SET_PARCEL_MEASUREMENTS;

    UpdateType SET_PARCEL_TRACKING_DATA = UpdateTypeEnum.SET_PARCEL_TRACKING_DATA;

    UpdateType SET_PASSWORD = UpdateTypeEnum.SET_PASSWORD;

    UpdateType SET_PRODUCT_PRICE_CUSTOM_FIELD = UpdateTypeEnum.SET_PRODUCT_PRICE_CUSTOM_FIELD;

    UpdateType SET_PRODUCT_PRICE_CUSTOM_TYPE = UpdateTypeEnum.SET_PRODUCT_PRICE_CUSTOM_TYPE;

    UpdateType SET_PRODUCT_VARIANT_KEY = UpdateTypeEnum.SET_PRODUCT_VARIANT_KEY;

    UpdateType SET_RATING = UpdateTypeEnum.SET_RATING;

    UpdateType SET_RESTOCKABLE_IN_DAYS = UpdateTypeEnum.SET_RESTOCKABLE_IN_DAYS;

    UpdateType SET_RETURN_PAYMENT_STATE = UpdateTypeEnum.SET_RETURN_PAYMENT_STATE;

    UpdateType SET_RETURN_SHIPMENT_STATE = UpdateTypeEnum.SET_RETURN_SHIPMENT_STATE;

    UpdateType SET_ROLES = UpdateTypeEnum.SET_ROLES;

    UpdateType SET_SALUTATION = UpdateTypeEnum.SET_SALUTATION;

    UpdateType SET_SEARCH_KEYWORDS = UpdateTypeEnum.SET_SEARCH_KEYWORDS;

    UpdateType SET_SHIPPING_ADDRESS = UpdateTypeEnum.SET_SHIPPING_ADDRESS;

    UpdateType SET_SKU = UpdateTypeEnum.SET_SKU;

    UpdateType SET_SLUG = UpdateTypeEnum.SET_SLUG;

    UpdateType SET_STATUS_INTERFACE_CODE = UpdateTypeEnum.SET_STATUS_INTERFACE_CODE;

    UpdateType SET_STATUS_INTERFACE_TEXT = UpdateTypeEnum.SET_STATUS_INTERFACE_TEXT;

    UpdateType SET_STORE = UpdateTypeEnum.SET_STORE;

    UpdateType SET_STORES = UpdateTypeEnum.SET_STORES;

    UpdateType SET_SUPPLY_CHANNEL = UpdateTypeEnum.SET_SUPPLY_CHANNEL;

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

    UpdateType SET_VALID_UNTIL = UpdateTypeEnum.SET_VALID_UNTIL;

    UpdateType SET_VARIANT_AVAILABILITY = UpdateTypeEnum.SET_VARIANT_AVAILABILITY;

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
         * addAttributeDefinition
         */
        ADD_ATTRIBUTE_DEFINITION("addAttributeDefinition"),

        /**
         * addBillingAddressId
         */
        ADD_BILLING_ADDRESS_ID("addBillingAddressId"),

        /**
         * addDelivery
         */
        ADD_DELIVERY("addDelivery"),

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
         * changeQuantity
         */
        CHANGE_QUANTITY("changeQuantity"),

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
         * changeTarget
         */
        CHANGE_TARGET("changeTarget"),

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
         * removeAttributeDefinition
         */
        REMOVE_ATTRIBUTE_DEFINITION("removeAttributeDefinition"),

        /**
         * removeBillingAddressId
         */
        REMOVE_BILLING_ADDRESS_ID("removeBillingAddressId"),

        /**
         * removeDelivery
         */
        REMOVE_DELIVERY("removeDelivery"),

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
         * setAddress
         */
        SET_ADDRESS("setAddress"),

        /**
         * setAnonymousId
         */
        SET_ANONYMOUS_ID("setAnonymousId"),

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
         * setCustomLineItemShippingDetails
         */
        SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS("setCustomLineItemShippingDetails"),

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
         * setLineItemShippingDetails
         */
        SET_LINE_ITEM_SHIPPING_DETAILS("setLineItemShippingDetails"),

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
         * setProductPriceCustomField
         */
        SET_PRODUCT_PRICE_CUSTOM_FIELD("setProductPriceCustomField"),

        /**
         * setProductPriceCustomType
         */
        SET_PRODUCT_PRICE_CUSTOM_TYPE("setProductPriceCustomType"),

        /**
         * setProductVariantKey
         */
        SET_PRODUCT_VARIANT_KEY("setProductVariantKey"),

        /**
         * setRating
         */
        SET_RATING("setRating"),

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
         * setShippingAddress
         */
        SET_SHIPPING_ADDRESS("setShippingAddress"),

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
         * setStores
         */
        SET_STORES("setStores"),

        /**
         * setSupplyChannel
         */
        SET_SUPPLY_CHANNEL("setSupplyChannel"),

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
         * setValidUntil
         */
        SET_VALID_UNTIL("setValidUntil"),

        /**
         * setVariantAvailability
         */
        SET_VARIANT_AVAILABILITY("setVariantAvailability"),

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
