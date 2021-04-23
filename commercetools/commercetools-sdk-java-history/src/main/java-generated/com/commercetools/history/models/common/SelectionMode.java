
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface SelectionMode {

    SelectionMode CHEAPEST = SelectionModeEnum.CHEAPEST;

    SelectionMode MOST_EXPENSIVE = SelectionModeEnum.MOST_EXPENSIVE;

    enum SelectionModeEnum implements SelectionMode {
        CHEAPEST("Cheapest"),

        MOST_EXPENSIVE("MostExpensive");
        private final String jsonName;

        private SelectionModeEnum(final String jsonName) {
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
    public static SelectionMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new SelectionMode() {
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

    public static Optional<SelectionMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static SelectionMode[] values() {
        return SelectionModeEnum.values();
    }
}
