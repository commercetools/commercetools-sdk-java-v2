
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface LineItemMode {

    LineItemMode STANDARD = LineItemModeEnum.STANDARD;

    LineItemMode GIFT_LINE_ITEM = LineItemModeEnum.GIFT_LINE_ITEM;

    enum LineItemModeEnum implements LineItemMode {
        STANDARD("Standard"),

        GIFT_LINE_ITEM("GiftLineItem");
        private final String jsonName;

        private LineItemModeEnum(final String jsonName) {
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
    public static LineItemMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new LineItemMode() {
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

    public static Optional<LineItemMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static LineItemMode[] values() {
        return LineItemModeEnum.values();
    }
}
