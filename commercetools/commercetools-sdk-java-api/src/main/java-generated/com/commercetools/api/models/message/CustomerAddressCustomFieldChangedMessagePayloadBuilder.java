
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddressCustomFieldChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressCustomFieldChangedMessagePayload customerAddressCustomFieldChangedMessagePayload = CustomerAddressCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddressCustomFieldChangedMessagePayloadBuilder
        implements Builder<CustomerAddressCustomFieldChangedMessagePayload> {

    private String name;

    private java.lang.Object value;

    @Nullable
    private java.lang.Object previousValue;

    @Nullable
    private String addressId;

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomerAddressCustomFieldChangedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetAddressCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @param value value to be set
     * @return Builder
     */

    public CustomerAddressCustomFieldChangedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetAddressCustomFieldAction" rel="nofollow">Set CustomField</a> update action. When there has not been a Custom Field with the <code>name</code> on the Customer Address before, a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerAddressCustomFieldAddedMessage" rel="nofollow">Customer Address Custom Field Added</a> Message is generated instead.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public CustomerAddressCustomFieldChangedMessagePayloadBuilder previousValue(
            @Nullable final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> of which the Custom Field was changed.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public CustomerAddressCustomFieldChangedMessagePayloadBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetAddressCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetAddressCustomFieldAction" rel="nofollow">Set CustomField</a> update action. When there has not been a Custom Field with the <code>name</code> on the Customer Address before, a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerAddressCustomFieldAddedMessage" rel="nofollow">Customer Address Custom Field Added</a> Message is generated instead.</p>
     * @return previousValue
     */

    @Nullable
    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> of which the Custom Field was changed.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     * builds CustomerAddressCustomFieldChangedMessagePayload with checking for non-null required values
     * @return CustomerAddressCustomFieldChangedMessagePayload
     */
    public CustomerAddressCustomFieldChangedMessagePayload build() {
        Objects.requireNonNull(name, CustomerAddressCustomFieldChangedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, CustomerAddressCustomFieldChangedMessagePayload.class + ": value is missing");
        return new CustomerAddressCustomFieldChangedMessagePayloadImpl(name, value, previousValue, addressId);
    }

    /**
     * builds CustomerAddressCustomFieldChangedMessagePayload without checking for non-null required values
     * @return CustomerAddressCustomFieldChangedMessagePayload
     */
    public CustomerAddressCustomFieldChangedMessagePayload buildUnchecked() {
        return new CustomerAddressCustomFieldChangedMessagePayloadImpl(name, value, previousValue, addressId);
    }

    /**
     * factory method for an instance of CustomerAddressCustomFieldChangedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerAddressCustomFieldChangedMessagePayloadBuilder of() {
        return new CustomerAddressCustomFieldChangedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerAddressCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressCustomFieldChangedMessagePayloadBuilder of(
            final CustomerAddressCustomFieldChangedMessagePayload template) {
        CustomerAddressCustomFieldChangedMessagePayloadBuilder builder = new CustomerAddressCustomFieldChangedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.previousValue = template.getPreviousValue();
        builder.addressId = template.getAddressId();
        return builder;
    }

}
