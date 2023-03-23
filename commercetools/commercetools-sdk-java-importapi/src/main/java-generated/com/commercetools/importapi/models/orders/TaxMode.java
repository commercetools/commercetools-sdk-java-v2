
package com.commercetools.importapi.models.orders;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Maps to <code>Order.taxMode</code></p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TaxMode {

    TaxMode PLATFORM = TaxModeEnum.PLATFORM;

    TaxMode EXTERNAL = TaxModeEnum.EXTERNAL;

    TaxMode EXTERNAL_AMOUNT = TaxModeEnum.EXTERNAL_AMOUNT;

    TaxMode DISABLED = TaxModeEnum.DISABLED;

    enum TaxModeEnum implements TaxMode {
        PLATFORM("Platform"),

        EXTERNAL("External"),

        EXTERNAL_AMOUNT("ExternalAmount"),

        DISABLED("Disabled");
        private final String jsonName;

        private TaxModeEnum(final String jsonName) {
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
    public static TaxMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new TaxMode() {
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

    public static Optional<TaxMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static TaxMode[] values() {
        return TaxModeEnum.values();
    }

}
