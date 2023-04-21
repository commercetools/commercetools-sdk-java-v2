
package com.commercetools.api.models.order;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReturnShipmentState
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ReturnShipmentState extends JsonEnum {

    ReturnShipmentState ADVISED = ReturnShipmentStateEnum.ADVISED;

    ReturnShipmentState RETURNED = ReturnShipmentStateEnum.RETURNED;

    ReturnShipmentState BACK_IN_STOCK = ReturnShipmentStateEnum.BACK_IN_STOCK;

    ReturnShipmentState UNUSABLE = ReturnShipmentStateEnum.UNUSABLE;

    /**
     * possible values of ReturnShipmentState
     */
    enum ReturnShipmentStateEnum implements ReturnShipmentState {
        /**
         * Advised
         */
        ADVISED("Advised"),

        /**
         * Returned
         */
        RETURNED("Returned"),

        /**
         * BackInStock
         */
        BACK_IN_STOCK("BackInStock"),

        /**
         * Unusable
         */
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
     * factory method for a enum value of ReturnShipmentState
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<ReturnShipmentState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ReturnShipmentState[] values() {
        return ReturnShipmentStateEnum.values();
    }

}
