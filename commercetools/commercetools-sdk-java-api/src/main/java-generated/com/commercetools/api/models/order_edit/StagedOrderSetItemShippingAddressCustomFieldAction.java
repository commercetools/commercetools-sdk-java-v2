
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetItemShippingAddressCustomFieldActionImpl.class)
public interface StagedOrderSetItemShippingAddressCustomFieldAction extends StagedOrderUpdateAction {

    String SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD = "setItemShippingAddressCustomField";

    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>The value of a Custom Field.
    *  The data type of the value depends on the specific <a href="/projects/types#fieldtype">FieldType</a> given in the <code>type</code> field of the <a href="/ctp:api:type:FieldDefinition">FieldDefinition</a> for a Custom Field.
    *  It can be any of the following:</p>
    *  <p>| Field type                                                 | Data type                                                                                                                                                                 |
    *  | ---------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
    *  | <a href="ctp:api:type:CustomFieldBooleanType">CustomFieldBooleanType</a>                 | Boolean (<code>true</code> or <code>false</code>)                                                                                                                                                     |
    *  | <a href="ctp:api:type:CustomFieldStringType">CustomFieldStringType</a>                   | String                                                                                                                                                                |
    *  | <a href="ctp:api:type:CustomFieldLocalizedStringType">CustomFieldLocalizedStringType</a> | <a href="ctp:api:type:LocalizedString">LocalizedString</a>                                                                                                                             |
    *  | <a href="ctp:api:type:CustomFieldEnumType">CustomFieldEnumType</a>                       | String. Must be a <code>key</code> of one of the <a href="ctp:api:type:CustomFieldEnumValue">EnumValues</a> defined in the <a href="ctp:api:type:CustomFiedEnumType">EnumType</a>                                     |
    *  | <a href="ctp:api:type:CustomFieldLocalizedEnumType">CustomFieldLocalizedEnumType</a>     | String. Must be a <code>key</code> of one of the <a href="ctp:api:type:CustomFieldLocalizedEnumValue">LocalizedEnumValues</a> defined in the <a href="ctp:api:type:CustomFieldLocalizedEnumType">LocalizedEnumType</a> |
    *  | <a href="ctp:api:type:CustomFieldNumberType">CustomFieldNumberType</a>                   | Number                                                                                                                                                                |
    *  | <a href="ctp:api:type:CustomFieldMoneyType">CustomFieldMoneyType</a>                     | <a href="/../api/types#centprecisionmoney">CentPrecisionMoney</a>                                                                                                                                         |
    *  | <a href="ctp:api:type:CustomFieldDateType">CustomFieldDateType</a>                       | <a href="ctp:api:type:Date">Date</a>                                                                                                                                                   |
    *  | <a href="ctp:api:type:CustomFieldTimeType">CustomFieldTimeType</a>                       | <a href="ctp:api:type:Time">Time</a>                                                                                                                                                   |
    *  | <a href="ctp:api:type:CustomFieldDateTimeType">CustomFieldDateTimeType</a>               | <a href="ctp:api:type:DateTime">DateTime</a>                                                                                                                                           |
    *  | <a href="ctp:api:type:CustomFieldReferenceType">CustomFieldReferenceType</a>             | <a href="/../api/types#reference">Reference</a>                                                                                                                                         |
    *  | <a href="ctp:api:type:CustomFieldSetType">CustomFieldSetType</a>                         | JSON array without duplicates consisting of <a href="ctp:api:type:CustomFieldValue">CustomFieldValues</a> of a single <a href="ctp:api:type:FieldType">FieldType</a>. For example, a Custom Field of SetType of DateType takes a JSON array of mutually different Dates for its value. The order of items in the array is not fixed. For more examples, see the <a href="ctp:api:type:FieldContainer">example FieldContainer</a>.|</p>
    */

    @JsonProperty("value")
    public Object getValue();

    public void setAddressKey(final String addressKey);

    public void setName(final String name);

    public void setValue(final Object value);

    public static StagedOrderSetItemShippingAddressCustomFieldAction of() {
        return new StagedOrderSetItemShippingAddressCustomFieldActionImpl();
    }

    public static StagedOrderSetItemShippingAddressCustomFieldAction of(
            final StagedOrderSetItemShippingAddressCustomFieldAction template) {
        StagedOrderSetItemShippingAddressCustomFieldActionImpl instance = new StagedOrderSetItemShippingAddressCustomFieldActionImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StagedOrderSetItemShippingAddressCustomFieldActionBuilder builder() {
        return StagedOrderSetItemShippingAddressCustomFieldActionBuilder.of();
    }

    public static StagedOrderSetItemShippingAddressCustomFieldActionBuilder builder(
            final StagedOrderSetItemShippingAddressCustomFieldAction template) {
        return StagedOrderSetItemShippingAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetItemShippingAddressCustomFieldAction(
            Function<StagedOrderSetItemShippingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
