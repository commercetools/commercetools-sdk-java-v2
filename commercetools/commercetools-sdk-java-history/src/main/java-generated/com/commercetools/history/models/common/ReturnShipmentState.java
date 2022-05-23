
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ReturnShipmentState {

    ReturnShipmentState ADVISED = ReturnShipmentStateEnum.ADVISED;

    ReturnShipmentState RETURNED = ReturnShipmentStateEnum.RETURNED;

    ReturnShipmentState BACK_IN_STOCK = ReturnShipmentStateEnum.BACK_IN_STOCK;

    ReturnShipmentState UNUSABLE = ReturnShipmentStateEnum.UNUSABLE;

    enum ReturnShipmentStateEnum implements ReturnShipmentState {
        ADVISED("Advised"),

        RETURNED("Returned"),

        BACK_IN_STOCK("BackInStock"),

        UNUSABLE("Unusable");
        private final String jsonName;

        private ReturnShipmentStateEnum(final String jsonName) {
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
    public static ReturnShipmentState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ReturnShipmentState() {
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

    public static Optional<ReturnShipmentState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ReturnShipmentState[] values() {
        return ReturnShipmentStateEnum.values();
    }
}
