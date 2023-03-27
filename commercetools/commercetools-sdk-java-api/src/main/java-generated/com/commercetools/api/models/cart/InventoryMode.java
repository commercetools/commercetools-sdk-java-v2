
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates how Line Items in a Cart are tracked.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface InventoryMode {

    /**
    	<p>Adding and ordering items from a Cart are independent of the Inventory with no inventory checks or modifications.</p>
    	<p>This is the default mode.</p>

    */
    InventoryMode NONE = InventoryModeEnum.NONE;
    /**
    	<p>Orders are tracked on the Inventory, and ordering a <a href="ctp:api:type:LineItem">LineItem</a> deducts the available quantity on the respective <a href="ctp:api:type:InventoryEntry">InventoryEntry</a>.</p>
    	<p>An <a href="/../api/projects/orders#create-order">Order can be created</a> even if the Line Item quantity is zero or negative, but if no matching Inventory Entry exists for the Line Item, an <a href="ctp:api:type:OutOfStockError">OutOfStock</a> error is returned.</p>

    */
    InventoryMode TRACK_ONLY = InventoryModeEnum.TRACK_ONLY;
    /**
    	<p>Line Items in a Cart are only reserved for the duration of the ordering transaction.
    	If a Line Item is not available when <a href="/../api/projects/orders#create-order">creating an Order</a>, an <a href="ctp:api:type:OutOfStockError">OutOfStock</a> error is returned.
    	This is because the <a href="ctp:api:type:InventoryEntry">InventoryEntry</a> <code>availableQuantity</code> is insufficient (but is still updated) for the ordered Line Item quantity.</p>
    	<p>However, an Order can be created if the <a href="ctp:api:type:InventoryEntry">InventoryEntry</a> <code>restockableInDays</code> is set (including <code>0</code>).</p>

    */
    InventoryMode RESERVE_ON_ORDER = InventoryModeEnum.RESERVE_ON_ORDER;

    /**
     * possible values of InventoryMode
     */
    enum InventoryModeEnum implements InventoryMode {
        /**
         * None
         */
        NONE("None"),

        /**
         * TrackOnly
         */
        TRACK_ONLY("TrackOnly"),

        /**
         * ReserveOnOrder
         */
        RESERVE_ON_ORDER("ReserveOnOrder");
        private final String jsonName;

        private InventoryModeEnum(final String jsonName) {
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
     * factory method for a enum value of InventoryMode
     * if no enum has been found an anonymous instance will be created
     * @return enum instance
     */
    @JsonCreator
    public static InventoryMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new InventoryMode() {
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
     * @return optional of enum instance
     */
    public static Optional<InventoryMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static InventoryMode[] values() {
        return InventoryModeEnum.values();
    }

    public static com.commercetools.api.models.cart.InventoryMode defaultValue() {
        return com.commercetools.api.models.cart.InventoryMode.NONE;
    }

}
