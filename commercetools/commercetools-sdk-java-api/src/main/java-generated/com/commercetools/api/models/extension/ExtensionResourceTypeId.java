
package com.commercetools.api.models.extension;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ExtensionResourceTypeId {

    ExtensionResourceTypeId CART = ExtensionResourceTypeIdEnum.CART;

    ExtensionResourceTypeId ORDER = ExtensionResourceTypeIdEnum.ORDER;

    ExtensionResourceTypeId PAYMENT = ExtensionResourceTypeIdEnum.PAYMENT;

    ExtensionResourceTypeId CUSTOMER = ExtensionResourceTypeIdEnum.CUSTOMER;

    enum ExtensionResourceTypeIdEnum implements ExtensionResourceTypeId {
        CART("cart"),

        ORDER("order"),

        PAYMENT("payment"),

        CUSTOMER("customer");
        private final String jsonName;

        private ExtensionResourceTypeIdEnum(final String jsonName) {
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
    public static ExtensionResourceTypeId findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ExtensionResourceTypeId() {
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

    public static Optional<ExtensionResourceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ExtensionResourceTypeId[] values() {
        return ExtensionResourceTypeIdEnum.values();
    }
}
