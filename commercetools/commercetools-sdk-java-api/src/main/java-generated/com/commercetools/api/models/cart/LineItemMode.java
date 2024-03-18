
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates how a Line Item was added to a Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface LineItemMode extends JsonEnum {

    /**
    <p>The Line Item was added during Cart creation or the Add LineItem update action. The Line Item quantity can be changed without restriction.</p> */
    LineItemMode STANDARD = LineItemModeEnum.STANDARD;
    /**
    <p>One Line Item was added automatically to a Cart by a Cart Discount with CartDiscountValueGiftLineItemDraft.</p>
    <p>The quantity cannot be increased, and it won't be merged when adding the same Line Item to the Cart. If the gift is removed, an entry is added to the <code>refusedGifts</code> array and the discount won't be applied to the Cart. The price cannot be changed externally.</p>
    <p>All other updates, such as the ones related to Custom Fields, can be used.</p> */
    LineItemMode GIFT_LINE_ITEM = LineItemModeEnum.GIFT_LINE_ITEM;

    /**
     * possible values of LineItemMode
     */
    enum LineItemModeEnum implements LineItemMode {
        /**
         * Standard
         */
        STANDARD("Standard"),

        /**
         * GiftLineItem
         */
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
     * factory method for a enum value of LineItemMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<LineItemMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static LineItemMode[] values() {
        return LineItemModeEnum.values();
    }

}
