
package com.commercetools.api.models.shipping_method;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Can be one of the following or absent.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ShippingRateTierType {

    /**
    	<p>Used when the shipping rate maps to the sum of the <a href="ctp:api:type:LineItem">LineItem</a> prices. The value of the Cart is used to select a tier. If chosen, it is not possible to set a value for the <code>shippingRateInput</code> on the <a href="ctp:api:type:Cart">Cart</a>. Tiers contain the <code>centAmount</code> (a value of <code>100</code> in the currency <code>USD</code> corresponds to <code>$ 1.00</code>), and start at <code>1</code>.'</p>

    */
    ShippingRateTierType CART_VALUE = ShippingRateTierTypeEnum.CART_VALUE;
    /**
    	<p>Used when the shipping rate maps to an abstract Cart categorization expressed by strings, for example, <code>Light</code>, <code>Medium</code>, and <code>Heavy</code>. Only keys defined in the <code>values</code> array can be used to create a tier or to set a value of the <code>shippingRateInput</code> on the <a href="ctp:api:type:Cart">Cart</a>. The keys must be unique, and the request is rejected otherwise.</p>

    */
    ShippingRateTierType CART_CLASSIFICATION = ShippingRateTierTypeEnum.CART_CLASSIFICATION;
    /**
    	<p>Used when the shipping rate maps to an abstract Cart categorization expressed by integers such as shipping scores and weight ranges. The range starts at <code>0</code>. The default price covers the <code>0</code>, tiers start at <code>1</code>.</p>

    */
    ShippingRateTierType CART_SCORE = ShippingRateTierTypeEnum.CART_SCORE;

    enum ShippingRateTierTypeEnum implements ShippingRateTierType {
        CART_VALUE("CartValue"),

        CART_CLASSIFICATION("CartClassification"),

        CART_SCORE("CartScore");
        private final String jsonName;

        private ShippingRateTierTypeEnum(final String jsonName) {
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
    public static ShippingRateTierType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ShippingRateTierType() {
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

    public static Optional<ShippingRateTierType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ShippingRateTierType[] values() {
        return ShippingRateTierTypeEnum.values();
    }
}
