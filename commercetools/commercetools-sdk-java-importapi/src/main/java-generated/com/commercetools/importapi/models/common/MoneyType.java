
package com.commercetools.importapi.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MoneyType
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface MoneyType {

    MoneyType CENT_PRECISION = MoneyTypeEnum.CENT_PRECISION;

    MoneyType HIGH_PRECISION = MoneyTypeEnum.HIGH_PRECISION;

    enum MoneyTypeEnum implements MoneyType {
        CENT_PRECISION("centPrecision"),

        HIGH_PRECISION("highPrecision");
        private final String jsonName;

        private MoneyTypeEnum(final String jsonName) {
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
    public static MoneyType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new MoneyType() {
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

    public static Optional<MoneyType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static MoneyType[] values() {
        return MoneyTypeEnum.values();
    }
}
