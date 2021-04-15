
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface LineItemPriceMode {

    LineItemPriceMode PLATFORM = LineItemPriceModeEnum.PLATFORM;

    LineItemPriceMode EXTERNAL_TOTAL = LineItemPriceModeEnum.EXTERNAL_TOTAL;

    LineItemPriceMode EXTERNAL_PRICE = LineItemPriceModeEnum.EXTERNAL_PRICE;

    enum LineItemPriceModeEnum implements LineItemPriceMode {
        PLATFORM("Platform"),

        EXTERNAL_TOTAL("ExternalTotal"),

        EXTERNAL_PRICE("ExternalPrice");
        private final String jsonName;

        private LineItemPriceModeEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    @JsonCreator
    public static LineItemPriceMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new LineItemPriceMode() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }
        });
    }

    public static Optional<LineItemPriceMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static LineItemPriceMode[] values() {
        return LineItemPriceModeEnum.values();
    }
}
