
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Draft type to model divisions that are part of a Company or a higher order Division. Contains the fields and values of the generic BusinessUnitDraft that are used specifically for creating a Division.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DivisionDraft divisionDraft = DivisionDraft.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .parentUnit(parentUnitBuilder -> parentUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DivisionDraftImpl.class)
public interface DivisionDraft extends BusinessUnitDraft, io.vrap.rmf.base.client.Draft<DivisionDraft> {

    String DIVISION = "Division";

    /**
     *  <p>The parent unit of this Division. Can be a Company or a Division.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("parentUnit")
    public BusinessUnitResourceIdentifier getParentUnit();

    /**
     *  <p>If not set, the Division inherits the Stores from its <code>parentUnit</code>. Set this to <code>Explicit</code> if you want to set the Stores explicitly in the <code>stores</code> field instead.</p>
     */

    @JsonProperty("storeMode")
    public BusinessUnitStoreMode getStoreMode();

    public void setParentUnit(final BusinessUnitResourceIdentifier parentUnit);

    public void setStoreMode(final BusinessUnitStoreMode storeMode);

    public static DivisionDraft of() {
        return new DivisionDraftImpl();
    }

    public static DivisionDraft of(final DivisionDraft template) {
        DivisionDraftImpl instance = new DivisionDraftImpl();
        instance.setKey(template.getKey());
        instance.setStatus(template.getStatus());
        instance.setStores(template.getStores());
        instance.setStoreMode(template.getStoreMode());
        instance.setName(template.getName());
        instance.setContactEmail(template.getContactEmail());
        instance.setAssociates(template.getAssociates());
        instance.setAddresses(template.getAddresses());
        instance.setShippingAddresses(template.getShippingAddresses());
        instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
        instance.setBillingAddresses(template.getBillingAddresses());
        instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
        instance.setCustom(template.getCustom());
        instance.setParentUnit(template.getParentUnit());
        return instance;
    }

    public static DivisionDraftBuilder builder() {
        return DivisionDraftBuilder.of();
    }

    public static DivisionDraftBuilder builder(final DivisionDraft template) {
        return DivisionDraftBuilder.of(template);
    }

    default <T> T withDivisionDraft(Function<DivisionDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DivisionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DivisionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DivisionDraft>";
            }
        };
    }
}
