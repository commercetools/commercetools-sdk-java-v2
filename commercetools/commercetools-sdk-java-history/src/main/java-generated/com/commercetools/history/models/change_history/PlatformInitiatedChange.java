package com.commercetools.history.models.change_history;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PlatformInitiatedChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface PlatformInitiatedChange extends JsonEnum {

    
    PlatformInitiatedChange EXCLUDE_ALL = PlatformInitiatedChangeEnum.EXCLUDE_ALL;
    
    PlatformInitiatedChange CHANGE_LINE_ITEM_NAME = PlatformInitiatedChangeEnum.CHANGE_LINE_ITEM_NAME;
    
    PlatformInitiatedChange CHANGE_REVIEW_RATING_STATISTICS = PlatformInitiatedChangeEnum.CHANGE_REVIEW_RATING_STATISTICS;
    
    PlatformInitiatedChange SET_APPLICATION_VERSION = PlatformInitiatedChangeEnum.SET_APPLICATION_VERSION;
    
    PlatformInitiatedChange SET_IS_VALID = PlatformInitiatedChangeEnum.SET_IS_VALID;
    
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
         * changeLineItemName
         */
        CHANGE_LINE_ITEM_NAME("changeLineItemName"),
        
        /**
         * changeReviewRatingStatistics
         */
        CHANGE_REVIEW_RATING_STATISTICS("changeReviewRatingStatistics"),
        
        /**
         * setApplicationVersion
         */
        SET_APPLICATION_VERSION("setApplicationVersion"),
        
        /**
         * setIsValid
         */
        SET_IS_VALID("setIsValid"),
        
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
