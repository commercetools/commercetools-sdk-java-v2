
package com.commercetools.api.models.customer;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AnonymousCartSignInMode
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AnonymousCartSignInMode {

    /**
    	<p>If set, <a href="ctp:api:type:LineItem">LineItems</a> of an anonymous Cart are merged with the active Customer Cart that has been modified most recently. The <a href="ctp:api:type:CartState">CartState</a> of the anonymous Cart changes to <code>Merged</code> while the <a href="ctp:api:type:CartState">CartState</a> of the Customer's Cart remains <code>Active</code>. If a <a href="ctp:api:type:LineItem">LineItem</a> or <a href="ctp:api:type:CustomLineItem">CustomLineItem</a> in the anonymous Cart matches an existing Line Item or Custom Line Item in the Customer's Cart, the maximum quantity of both line items is used as the new quantity.</p>

    */
    AnonymousCartSignInMode MERGE_WITH_EXISTING_CUSTOMER_CART = AnonymousCartSignInModeEnum.MERGE_WITH_EXISTING_CUSTOMER_CART;
    /**
    	<p>If set, an anonymous Cart is used as the new active Customer Cart, and no <a href="ctp:api:type:LineItem">LineItems</a> are merged.</p>

    */
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
