
package com.commercetools.api.models.project;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Activated indicates that the Order Search feature is active. Deactivated means that the namely feature is currently configured to be inactive.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface OrderSearchStatus {

    OrderSearchStatus ACTIVATED = OrderSearchStatusEnum.ACTIVATED;

    OrderSearchStatus DEACTIVATED = OrderSearchStatusEnum.DEACTIVATED;

    enum OrderSearchStatusEnum implements OrderSearchStatus {
        ACTIVATED("Activated"),

        DEACTIVATED("Deactivated");
        private final String jsonName;

        private OrderSearchStatusEnum(final String jsonName) {
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
    public static OrderSearchStatus findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new OrderSearchStatus() {
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

    public static Optional<OrderSearchStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static OrderSearchStatus[] values() {
        return OrderSearchStatusEnum.values();
    }
}
