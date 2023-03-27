
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Draft type to model divisions that are part of the Company or a higher order Division. Contains the fields and values of the generic MyBusinessUnitDraft that are used specifically for creating a Division.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyDivisionDraft myDivisionDraft = MyDivisionDraft.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .parentUnit(parentUnitBuilder -> parentUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyDivisionDraftImpl.class)
public interface MyDivisionDraft extends MyBusinessUnitDraft, io.vrap.rmf.base.client.Draft<MyDivisionDraft> {

    /**
     * discriminator value for MyDivisionDraft
     */
    String DIVISION = "Division";

    /**
     *  <p>The parent unit of this Division. Can be a Company or a Division.</p>
     * @return parentUnit
     */
    @NotNull
    @Valid
    @JsonProperty("parentUnit")
    public BusinessUnitResourceIdentifier getParentUnit();

    /**
     *  <p>The parent unit of this Division. Can be a Company or a Division.</p>
     * @param parentUnit value to be set
     */

    public void setParentUnit(final BusinessUnitResourceIdentifier parentUnit);

    /**
     * factory method
     * @return instance of MyDivisionDraft
     */
    public static MyDivisionDraft of() {
        return new MyDivisionDraftImpl();
    }

    /**
     * factory method to copy an instance of MyDivisionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyDivisionDraft of(final MyDivisionDraft template) {
        MyDivisionDraftImpl instance = new MyDivisionDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setContactEmail(template.getContactEmail());
        instance.setCustom(template.getCustom());
        instance.setAddresses(template.getAddresses());
        instance.setShippingAddresses(template.getShippingAddresses());
        instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
        instance.setBillingAddresses(template.getBillingAddresses());
        instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
        instance.setParentUnit(template.getParentUnit());
        return instance;
    }

    /**
     * builder factory method for MyDivisionDraft
     * @return builder
     */
    public static MyDivisionDraftBuilder builder() {
        return MyDivisionDraftBuilder.of();
    }

    /**
     * create builder for MyDivisionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyDivisionDraftBuilder builder(final MyDivisionDraft template) {
        return MyDivisionDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyDivisionDraft(Function<MyDivisionDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyDivisionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyDivisionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyDivisionDraft>";
            }
        };
    }
}
