
package com.commercetools.api.models.customer;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface AnonymousCartSignInMode {

    AnonymousCartSignInMode MERGE_WITH_EXISTING_CUSTOMER_CART = AnonymousCartSignInModeEnum.MERGE_WITH_EXISTING_CUSTOMER_CART;

    AnonymousCartSignInMode USE_AS_NEW_ACTIVE_CUSTOMER_CART = AnonymousCartSignInModeEnum.USE_AS_NEW_ACTIVE_CUSTOMER_CART;

    enum AnonymousCartSignInModeEnum implements AnonymousCartSignInMode {
        MERGE_WITH_EXISTING_CUSTOMER_CART("MergeWithExistingCustomerCart"),

        USE_AS_NEW_ACTIVE_CUSTOMER_CART("UseAsNewActiveCustomerCart");
        private final String jsonName;

        private AnonymousCartSignInModeEnum(final String jsonName) {
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
    public static AnonymousCartSignInMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new AnonymousCartSignInMode() {
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

    public static Optional<AnonymousCartSignInMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static AnonymousCartSignInMode[] values() {
        return AnonymousCartSignInModeEnum.values();
    }
}
