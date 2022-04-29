
package com.commercetools.history.models.change_history;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface PlatformInitiatedChange {

    PlatformInitiatedChange EXCLUDE_ALL = PlatformInitiatedChangeEnum.EXCLUDE_ALL;

    PlatformInitiatedChange CHANGE_LINE_ITEM_NAME = PlatformInitiatedChangeEnum.CHANGE_LINE_ITEM_NAME;

    PlatformInitiatedChange CHANGE_REVIEW_RATING_STATISTICS = PlatformInitiatedChangeEnum.CHANGE_REVIEW_RATING_STATISTICS;

    PlatformInitiatedChange SET_APPLICATION_VERSION = PlatformInitiatedChangeEnum.SET_APPLICATION_VERSION;

    PlatformInitiatedChange SET_IS_VALID = PlatformInitiatedChangeEnum.SET_IS_VALID;

    PlatformInitiatedChange SET_VARIANT_AVAILABILITY = PlatformInitiatedChangeEnum.SET_VARIANT_AVAILABILITY;

    enum PlatformInitiatedChangeEnum implements PlatformInitiatedChange {
        EXCLUDE_ALL("excludeAll"),

        CHANGE_LINE_ITEM_NAME("changeLineItemName"),

        CHANGE_REVIEW_RATING_STATISTICS("changeReviewRatingStatistics"),

        SET_APPLICATION_VERSION("setApplicationVersion"),

        SET_IS_VALID("setIsValid"),

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

    @JsonValue
    String getJsonName();

    String name();

    String toString();

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

    public static Optional<PlatformInitiatedChange> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static PlatformInitiatedChange[] values() {
        return PlatformInitiatedChangeEnum.values();
    }
}
