
package com.commercetools.api.models.channel;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Describes how a Channel is used. A Channel can have one or more roles.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ChannelRoleEnum extends JsonEnum {

    /**
    <p>Channel can be used to track inventory entries (for example, Channels with this role can be treated as warehouses).</p> */
    ChannelRoleEnum INVENTORY_SUPPLY = ChannelRoleEnumEnum.INVENTORY_SUPPLY;
    /**
    <p>Channel can be used to expose Products to a specific distribution Channel. The Channel can be used by a Cart to <span>select</span> a Product Price.</p> */
    ChannelRoleEnum PRODUCT_DISTRIBUTION = ChannelRoleEnumEnum.PRODUCT_DISTRIBUTION;
    /**
    <p>Channel identifies a synchronization destination used when storing export information in <a href="https://docs.commercetools.com/apis/ctp:api:type:SyncInfo" rel="nofollow">SyncInfo</a>. You can reference it with <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderUpdateSyncInfoAction" rel="nofollow">Update SyncInfo</a> on Orders and Order Edits.</p> */
    ChannelRoleEnum ORDER_EXPORT = ChannelRoleEnumEnum.ORDER_EXPORT;
    /**
    <p>Channel identifies a synchronization destination used when storing import information in <a href="https://docs.commercetools.com/apis/ctp:api:type:SyncInfo" rel="nofollow">SyncInfo</a>. You can reference it with <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderUpdateSyncInfoAction" rel="nofollow">Update SyncInfo</a> on Orders and Order Edits.</p> */
    ChannelRoleEnum ORDER_IMPORT = ChannelRoleEnumEnum.ORDER_IMPORT;
    /**
    <p>Marks the Channel as the default or preferred Channel among Channels with the same role. It can be combined with another role, for example <code>InventorySupply</code>.</p> */
    ChannelRoleEnum PRIMARY = ChannelRoleEnumEnum.PRIMARY;

    /**
     * possible values of ChannelRoleEnum
     */
    enum ChannelRoleEnumEnum implements ChannelRoleEnum {
        /**
         * InventorySupply
         */
        INVENTORY_SUPPLY("InventorySupply"),

        /**
         * ProductDistribution
         */
        PRODUCT_DISTRIBUTION("ProductDistribution"),

        /**
         * OrderExport
         */
        ORDER_EXPORT("OrderExport"),

        /**
         * OrderImport
         */
        ORDER_IMPORT("OrderImport"),

        /**
         * Primary
         */
        PRIMARY("Primary");
        private final String jsonName;

        private ChannelRoleEnumEnum(final String jsonName) {
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
     * factory method for a enum value of ChannelRoleEnum
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ChannelRoleEnum findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ChannelRoleEnum() {
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
    public static Optional<ChannelRoleEnum> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ChannelRoleEnum[] values() {
        return ChannelRoleEnumEnum.values();
    }

}
