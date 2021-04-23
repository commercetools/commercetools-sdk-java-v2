
package com.commercetools.importapi.models.orders;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Maps to <code>Order.taxRoundingMode</code>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface RoundingMode {

    RoundingMode HALF_EVEN = RoundingModeEnum.HALF_EVEN;

    RoundingMode HALF_UP = RoundingModeEnum.HALF_UP;

    RoundingMode HALF_DOWN = RoundingModeEnum.HALF_DOWN;

    enum RoundingModeEnum implements RoundingMode {
        HALF_EVEN("HalfEven"),

        HALF_UP("HalfUp"),

        HALF_DOWN("HalfDown");
        private final String jsonName;

        private RoundingModeEnum(final String jsonName) {
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
    public static RoundingMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new RoundingMode() {
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

    public static Optional<RoundingMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static RoundingMode[] values() {
        return RoundingModeEnum.values();
    }
}
