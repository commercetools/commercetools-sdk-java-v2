
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates how a Line Item is added to a Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface LineItemMode {

    /**
    	<p>The Line Item is added during <a href="/../api/projects/carts#create-cart">Cart creation</a> or using the <a href="ctp:api:type:CartAddLineItemAction">Add LineItem</a> update action.
    	The Line Item quantity can be changed without restriction.</p>

    */
    LineItemMode STANDARD = LineItemModeEnum.STANDARD;
    /**
    	<p>The Line Item is added automatically by a Cart Discount with <a href="ctp:api:type:CartDiscountValueGiftLineItem">CartDiscountValueGiftLineItem</a>.</p>
    	<p>The quantity cannot be <a href="ctp:api:type:CartChangeLineItemQuantityAction">increased</a>, and it won't be merged when the same Line Item is <a href="ctp:api:type:CartAddLineItemAction">added</a> to the Cart.
    	If the gift is <a href="ctp:api:type:CartRemoveLineItemAction">removed</a>, an entry is added to the <code>refusedGifts</code> array and the discount won't be applied to the Cart.
    	The price cannot be changed <a href="ctp:api:type:CartSetLineItemTotalPriceAction">externally</a>.</p>
    	<p>All other updates, such as the ones related to Custom Fields, can be used.</p>

    */
    LineItemMode GIFT_LINE_ITEM = LineItemModeEnum.GIFT_LINE_ITEM;

    enum LineItemModeEnum implements LineItemMode {
        STANDARD("Standard"),

        GIFT_LINE_ITEM("GiftLineItem");
        private final String jsonName;

        private LineItemModeEnum(final String jsonName) {
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
    public static LineItemMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new LineItemMode() {
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

    public static Optional<LineItemMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static LineItemMode[] values() {
        return LineItemModeEnum.values();
    }

}
