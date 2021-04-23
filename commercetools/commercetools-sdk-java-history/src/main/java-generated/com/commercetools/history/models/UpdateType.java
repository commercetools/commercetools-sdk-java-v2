
package com.commercetools.history.models;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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

    enum UpdateTypeEnum implements UpdateType {
        ADD_ADDRESS("addAddress"),

        ADD_ASSET("addAsset"),

        ADD_ATTRIBUTE_DEFINITION("addAttributeDefinition"),

        ADD_BILLING_ADDRESS_ID("addBillingAddressId"),

        ADD_DELIVERY("addDelivery"),

        ADD_ENUM_VALUE("addEnumValue"),

        ADD_EXTERNAL_IMAGE("addExternalImage"),

        ADD_FIELD_DEFINITION("addFieldDefinition"),

        ADD_INTERFACE_INTERACTION("addInterfaceInteraction"),

        ADD_ITEM_SHIPPING_ADDRESS("addItemShippingAddress"),

        ADD_LINE_ITEM("addLineItem"),

        ADD_LOCALIZED_ENUM_VALUE("addLocalizedEnumValue"),

        ADD_LOCATION("addLocation"),

        ADD_PARCEL_TO_DELIVERY("addParcelToDelivery"),

        ADD_PAYMENT("addPayment"),

        ADD_PLAIN_ENUM_VALUE("addPlainEnumValue"),

        ADD_PRICE("addPrice"),

        ADD_RETURN_INFO("addReturnInfo"),

        ADD_ROLES("addRoles"),

        ADD_SHIPPING_ADDRESS_ID("addShippingAddressId"),

        ADD_TAX_RATE("addTaxRate"),

        ADD_TEXT_LINE_ITEM("addTextLineItem"),

        ADD_TO_CATEGORY("addToCategory"),

        ADD_TRANSACTION("addTransaction"),

        ADD_VARIANT("addVariant"),

        CHANGE_ADDRESS("changeAddress"),

        CHANGE_AMOUNT_PLANNED("changeAmountPlanned"),

        CHANGE_ASSET_NAME("changeAssetName"),

        CHANGE_ASSET_ORDER("changeAssetOrder"),

        CHANGE_ATTRIBUTE_CONSTRAINT("changeAttributeConstraint"),

        CHANGE_ATTRIBUTE_NAME("changeAttributeName"),

        CHANGE_ATTRIBUTE_ORDER_BY_NAME("changeAttributeOrderByName"),

        CHANGE_CART_DISCOUNTS("changeCartDiscounts"),

        CHANGE_CART_PREDICATE("changeCartPredicate"),

        CHANGE_DESCRIPTION("changeDescription"),

        CHANGE_EMAIL("changeEmail"),

        CHANGE_ENUM_KEY("changeEnumKey"),

        CHANGE_ENUM_VALUE_LABEL("changeEnumValueLabel"),

        CHANGE_ENUM_VALUE_ORDER("changeEnumValueOrder"),

        CHANGE_FIELD_DEFINITION_ORDER("changeFieldDefinitionOrder"),

        CHANGE_GROUPS("changeGroups"),

        CHANGE_INITIAL("changeInitial"),

        CHANGE_INPUT_HINT("changeInputHint"),

        CHANGE_IS_ACTIVE("changeIsActive"),

        CHANGE_IS_SEARCHABLE("changeIsSearchable"),

        CHANGE_KEY("changeKey"),

        CHANGE_LABEL("changeLabel"),

        CHANGE_LINE_ITEM_QUANTITY("changeLineItemQuantity"),

        CHANGE_LINE_ITEMS_ORDER("changeLineItemsOrder"),

        CHANGE_LOCALIZED_ENUM_VALUE_LABEL("changeLocalizedEnumValueLabel"),

        CHANGE_LOCALIZED_ENUM_VALUE_ORDER("changeLocalizedEnumValueOrder"),

        CHANGE_MASTER_VARIANT("changeMasterVariant"),

        CHANGE_NAME("changeName"),

        CHANGE_ORDER_HINT("changeOrderHint"),

        CHANGE_ORDER_STATE("changeOrderState"),

        CHANGE_PARENT("changeParent"),

        CHANGE_PAYMENT_STATE("changePaymentState"),

        CHANGE_PLAIN_ENUM_VALUE_LABEL("changePlainEnumValueLabel"),

        CHANGE_PREDICATE("changePredicate"),

        CHANGE_PRICE("changePrice"),

        CHANGE_QUANTITY("changeQuantity"),

        CHANGE_REQUIRES_DISCOUNT_CODE("changeRequiresDiscountCode"),

        CHANGE_REVIEW_RATING_STATISTICS("changeReviewRatingStatistics"),

        CHANGE_SHIPMENT_STATE("changeShipmentState"),

        CHANGE_SLUG("changeSlug"),

        CHANGE_SORT_ORDER("changeSortOrder"),

        CHANGE_STACKING_MODE("changeStackingMode"),

        CHANGE_TARGET("changeTarget"),

        CHANGE_TEXT_LINE_ITEM_NAME("changeTextLineItemName"),

        CHANGE_TEXT_LINE_ITEM_QUANTITY("changeTextLineItemQuantity"),

        CHANGE_TEXT_LINE_ITEMS_ORDER("changeTextLineItemsOrder"),

        CHANGE_TRANSACTION_INTERACTION_ID("changeTransactionInteractionId"),

        CHANGE_TRANSACTION_STATE("changeTransactionState"),

        CHANGE_TRANSACTION_TIMESTAMP("changeTransactionTimestamp"),

        CHANGE_TYPE("changeType"),

        CHANGE_VALUE("changeValue"),

        PUBLISH("publish"),

        REMOVE_ADDRESS("removeAddress"),

        REMOVE_ASSET("removeAsset"),

        REMOVE_ATTRIBUTE_DEFINITION("removeAttributeDefinition"),

        REMOVE_BILLING_ADDRESS_ID("removeBillingAddressId"),

        REMOVE_DELIVERY("removeDelivery"),

        REMOVE_ENUM_VALUES("removeEnumValues"),

        REMOVE_FIELD_DEFINITION("removeFieldDefinition"),

        REMOVE_FROM_CATEGORY("removeFromCategory"),

        REMOVE_IMAGE("removeImage"),

        REMOVE_ITEM_SHIPPING_ADDRESS("removeItemShippingAddress"),

        REMOVE_LINE_ITEM("removeLineItem"),

        REMOVE_LOCATION("removeLocation"),

        REMOVE_PARCEL_FROM_DELIVERY("removeParcelFromDelivery"),

        REMOVE_PAYMENT("removePayment"),

        REMOVE_PRICE("removePrice"),

        REMOVE_ROLES("removeRoles"),

        REMOVE_SHIPPING_ADDRESS_ID("removeShippingAddressId"),

        REMOVE_TAX_RATE("removeTaxRate"),

        REMOVE_TEXT_LINE_ITEM("removeTextLineItem"),

        REMOVE_VARIANT("removeVariant"),

        SET_ADDRESS("setAddress"),

        SET_ANONYMOUS_ID("setAnonymousId"),

        SET_ASSET_CUSTOM_FIELD("setAssetCustomField"),

        SET_ASSET_CUSTOM_TYPE("setAssetCustomType"),

        SET_ASSET_DESCRIPTION("setAssetDescription"),

        SET_ASSET_SOURCES("setAssetSources"),

        SET_ASSET_TAGS("setAssetTags"),

        SET_ASSSET_KEY("setAsssetKey"),

        SET_ATTRIBUTE("setAttribute"),

        SET_AUTHOR_NAME("setAuthorName"),

        SET_BILLING_ADDRESS("setBillingAddress"),

        SET_CART_PREDICATE("setCartPredicate"),

        SET_CATEGORY_ORDER_HINT("setCategoryOrderHint"),

        SET_COMPANY_NAME("setCompanyName"),

        SET_CUSTOM_FIELD("setCustomField"),

        SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD("setCustomLineItemCustomField"),

        SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE("setCustomLineItemCustomType"),

        SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS("setCustomLineItemShippingDetails"),

        SET_CUSTOM_TYPE("setCustomType"),

        SET_CUSTOMER("setCustomer"),

        SET_CUSTOMER_EMAIL("setCustomerEmail"),

        SET_CUSTOMER_GROUP("setCustomerGroup"),

        SET_CUSTOMER_ID("setCustomerId"),

        SET_CUSTOMER_NUMBER("setCustomerNumber"),

        SET_DATE_OF_BIRTH("setDateOfBirth"),

        SET_DEFAULT_BILLING_ADDRESS("setDefaultBillingAddress"),

        SET_DEFAULT_SHIPPING_ADDRESS("setDefaultShippingAddress"),

        SET_DELETE_DAYS_AFTER_LAST_MODIFICATION("setDeleteDaysAfterLastModification"),

        SET_DELIVERY_ADDRESS("setDeliveryAddress"),

        SET_DELIVERY_ITEMS("setDeliveryItems"),

        SET_DESCRIPTION("setDescription"),

        SET_DISCOUNTED_PRICE("setDiscountedPrice"),

        SET_DISTRIBUTION_CHANNELS("setDistributionChannels"),

        SET_EXPECTED_DELIVERY("setExpectedDelivery"),

        SET_EXTERNAL_ID("setExternalId"),

        SET_FIRST_NAME("setFirstName"),

        SET_GEO_LOCATION("setGeoLocation"),

        SET_IMAGE_LABEL("setImageLabel"),

        SET_INPUT_TIP("setInputTip"),

        SET_INTERFACE_ID("setInterfaceId"),

        SET_KEY("setKey"),

        SET_LANGUAGES("setLanguages"),

        SET_LAST_NAME("setLastName"),

        SET_LINE_ITEM_CUSTOM_FIELD("setLineItemCustomField"),

        SET_LINE_ITEM_CUSTOM_TYPE("setLineItemCustomType"),

        SET_LINE_ITEM_SHIPPING_DETAILS("setLineItemShippingDetails"),

        SET_LOCALE("setLocale"),

        SET_MAX_APPLICATIONS("setMaxApplications"),

        SET_MAX_APPLICATIONS_PER_CUSTOMER("setMaxApplicationsPerCustomer"),

        SET_META_DESCRIPTION("setMetaDescription"),

        SET_META_KEYWORDS("setMetaKeywords"),

        SET_META_TITLE("setMetaTitle"),

        SET_METHOD_INFO_INTERFACE("setMethodInfoInterface"),

        SET_METHOD_INFO_METHOD("setMethodInfoMethod"),

        SET_METHOD_INFO_NAME("setMethodInfoName"),

        SET_MIDDLE_NAME("setMiddleName"),

        SET_NAME("setName"),

        SET_ORDER_NUMBER("setOrderNumber"),

        SET_PARCEL_ITEMS("setParcelItems"),

        SET_PARCEL_MEASUREMENTS("setParcelMeasurements"),

        SET_PARCEL_TRACKING_DATA("setParcelTrackingData"),

        SET_PASSWORD("setPassword"),

        SET_PRODUCT_PRICE_CUSTOM_FIELD("setProductPriceCustomField"),

        SET_PRODUCT_PRICE_CUSTOM_TYPE("setProductPriceCustomType"),

        SET_PRODUCT_VARIANT_KEY("setProductVariantKey"),

        SET_RATING("setRating"),

        SET_RESTOCKABLE_IN_DAYS("setRestockableInDays"),

        SET_RETURN_PAYMENT_STATE("setReturnPaymentState"),

        SET_RETURN_SHIPMENT_STATE("setReturnShipmentState"),

        SET_ROLES("setRoles"),

        SET_SALUTATION("setSalutation"),

        SET_SEARCH_KEYWORDS("setSearchKeywords"),

        SET_SHIPPING_ADDRESS("setShippingAddress"),

        SET_SKU("setSku"),

        SET_SLUG("setSlug"),

        SET_STATUS_INTERFACE_CODE("setStatusInterfaceCode"),

        SET_STATUS_INTERFACE_TEXT("setStatusInterfaceText"),

        SET_STORE("setStore"),

        SET_STORES("setStores"),

        SET_SUPPLY_CHANNEL("setSupplyChannel"),

        SET_TARGET("setTarget"),

        SET_TAX_CATEGORY("setTaxCategory"),

        SET_TEXT("setText"),

        SET_TEXT_LINE_ITEM_CUSTOM_FIELD("setTextLineItemCustomField"),

        SET_TEXT_LINE_ITEM_CUSTOM_TYPE("setTextLineItemCustomType"),

        SET_TEXT_LINE_ITEM_DESCRIPTION("setTextLineItemDescription"),

        SET_TITLE("setTitle"),

        SET_TRANSITIONS("setTransitions"),

        SET_VALID_FROM("setValidFrom"),

        SET_VALID_FROM_AND_UNTIL("setValidFromAndUntil"),

        SET_VALID_UNTIL("setValidUntil"),

        SET_VARIANT_AVAILABILITY("setVariantAvailability"),

        SET_VAT_ID("setVatId"),

        TRANSITION_CUSTOM_LINE_ITEM_STATE("transitionCustomLineItemState"),

        TRANSITION_LINE_ITEM_STATE("transitionLineItemState"),

        TRANSITION_STATE("transitionState"),

        UNPUBLISH("unpublish"),

        UPDATE_ITEM_SHIPPING_ADDRESS("updateItemShippingAddress"),

        UPDATE_SYNC_INFO("updateSyncInfo"),

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

    @JsonValue
    String getJsonName();

    String name();

    String toString();

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

    public static Optional<UpdateType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static UpdateType[] values() {
        return UpdateTypeEnum.values();
    }
}
