
package com.commercetools.api.models.cart_discount;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface StackingMode {

    StackingMode STACKING = StackingModeEnum.STACKING;

    StackingMode STOP_AFTER_THIS_DISCOUNT = StackingModeEnum.STOP_AFTER_THIS_DISCOUNT;

    enum StackingModeEnum implements StackingMode {
        STACKING("Stacking"),

        STOP_AFTER_THIS_DISCOUNT("StopAfterThisDiscount");
        private final String jsonName;

        private StackingModeEnum(final String jsonName) {
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
    public static StackingMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new StackingMode() {
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

    public static Optional<StackingMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static StackingMode[] values() {
        return StackingModeEnum.values();
    }
}
