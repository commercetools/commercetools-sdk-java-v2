
package com.commercetools.history.models.change_history;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updates that are triggered automatically as a result of a user-initiated change.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface PlatformInitiatedChange extends JsonEnum {

    PlatformInitiatedChange EXCLUDE_ALL = PlatformInitiatedChangeEnum.EXCLUDE_ALL;

    PlatformInitiatedChange ADD_INHERITED_ASSOCIATE = PlatformInitiatedChangeEnum.ADD_INHERITED_ASSOCIATE;

    PlatformInitiatedChange CHANGE_INCLUDED_IN_STATISTICS = PlatformInitiatedChangeEnum.CHANGE_INCLUDED_IN_STATISTICS;

    PlatformInitiatedChange CHANGE_INHERITED_ASSOCIATE = PlatformInitiatedChangeEnum.CHANGE_INHERITED_ASSOCIATE;

    PlatformInitiatedChange CHANGE_LAST_VARIANT_ID = PlatformInitiatedChangeEnum.CHANGE_LAST_VARIANT_ID;

    PlatformInitiatedChange CHANGE_LINE_ITEM_NAME = PlatformInitiatedChangeEnum.CHANGE_LINE_ITEM_NAME;

    PlatformInitiatedChange CHANGE_LINE_ITEM_PUBLISHED = PlatformInitiatedChangeEnum.CHANGE_LINE_ITEM_PUBLISHED;

    PlatformInitiatedChange CHANGE_REVIEW_RATING_STATISTICS = PlatformInitiatedChangeEnum.CHANGE_REVIEW_RATING_STATISTICS;

    PlatformInitiatedChange CHANGE_TOP_LEVEL_UNIT = PlatformInitiatedChangeEnum.CHANGE_TOP_LEVEL_UNIT;

    PlatformInitiatedChange REMOVE_INHERITED_ASSOCIATE = PlatformInitiatedChangeEnum.REMOVE_INHERITED_ASSOCIATE;

    PlatformInitiatedChange SET_ANCESTORS = PlatformInitiatedChangeEnum.SET_ANCESTORS;

    PlatformInitiatedChange SET_APPLICATION_VERSION = PlatformInitiatedChangeEnum.SET_APPLICATION_VERSION;

    PlatformInitiatedChange SET_INHERITED_ASSOCIATES = PlatformInitiatedChangeEnum.SET_INHERITED_ASSOCIATES;

    PlatformInitiatedChange SET_INHERITED_STORES = PlatformInitiatedChangeEnum.SET_INHERITED_STORES;

    PlatformInitiatedChange SET_IS_VALID = PlatformInitiatedChangeEnum.SET_IS_VALID;

    PlatformInitiatedChange SET_LINE_ITEM_DEACTIVATED_AT = PlatformInitiatedChangeEnum.SET_LINE_ITEM_DEACTIVATED_AT;

    PlatformInitiatedChange SET_PRODUCT_COUNT = PlatformInitiatedChangeEnum.SET_PRODUCT_COUNT;

    PlatformInitiatedChange SET_RESERVATIONS = PlatformInitiatedChangeEnum.SET_RESERVATIONS;

    PlatformInitiatedChange SET_VARIANT_AVAILABILITY = PlatformInitiatedChangeEnum.SET_VARIANT_AVAILABILITY;

    /**
     * possible values of PlatformInitiatedChange
     */
    enum PlatformInitiatedChangeEnum implements PlatformInitiatedChange {
        /**
         * excludeAll
         */
        EXCLUDE_ALL("excludeAll"),

        /**
         * addInheritedAssociate
         */
        ADD_INHERITED_ASSOCIATE("addInheritedAssociate"),

        /**
         * changeIncludedInStatistics
         */
        CHANGE_INCLUDED_IN_STATISTICS("changeIncludedInStatistics"),

        /**
         * changeInheritedAssociate
         */
        CHANGE_INHERITED_ASSOCIATE("changeInheritedAssociate"),

        /**
         * changeLastVariantId
         */
        CHANGE_LAST_VARIANT_ID("changeLastVariantId"),

        /**
         * changeLineItemName
         */
        CHANGE_LINE_ITEM_NAME("changeLineItemName"),

        /**
         * changeLineItemPublished
         */
        CHANGE_LINE_ITEM_PUBLISHED("changeLineItemPublished"),

        /**
         * changeReviewRatingStatistics
         */
        CHANGE_REVIEW_RATING_STATISTICS("changeReviewRatingStatistics"),

        /**
         * changeTopLevelUnit
         */
        CHANGE_TOP_LEVEL_UNIT("changeTopLevelUnit"),

        /**
         * removeInheritedAssociate
         */
        REMOVE_INHERITED_ASSOCIATE("removeInheritedAssociate"),

        /**
         * setAncestors
         */
        SET_ANCESTORS("setAncestors"),

        /**
         * setApplicationVersion
         */
        SET_APPLICATION_VERSION("setApplicationVersion"),

        /**
         * setInheritedAssociates
         */
        SET_INHERITED_ASSOCIATES("setInheritedAssociates"),

        /**
         * setInheritedStores
         */
        SET_INHERITED_STORES("setInheritedStores"),

        /**
         * setIsValid
         */
        SET_IS_VALID("setIsValid"),

        /**
         * setLineItemDeactivatedAt
         */
        SET_LINE_ITEM_DEACTIVATED_AT("setLineItemDeactivatedAt"),

        /**
         * setProductCount
         */
        SET_PRODUCT_COUNT("setProductCount"),

        /**
         * setReservations
         */
        SET_RESERVATIONS("setReservations"),

        /**
         * setVariantAvailability
         */
        SET_VARIANT_AVAILABILITY("setVariantAvailability");
        private final String jsonName;

        private PlatformInitiatedChangeEnum(final String jsonName) {
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
     * factory method for a enum value of PlatformInitiatedChange
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static PlatformInitiatedChange findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new PlatformInitiatedChange() {
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
    public static Optional<PlatformInitiatedChange> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static PlatformInitiatedChange[] values() {
        return PlatformInitiatedChangeEnum.values();
    }

}
