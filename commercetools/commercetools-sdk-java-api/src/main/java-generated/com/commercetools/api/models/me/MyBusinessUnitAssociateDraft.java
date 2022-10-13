
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitAssociateDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitAssociateDraft myBusinessUnitAssociateDraft = MyBusinessUnitAssociateDraft.builder()
 *             .version(0.3)
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitAssociateDraftImpl.class)
public interface MyBusinessUnitAssociateDraft {

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Customer to create and assign to the Business Unit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public MyCustomerDraft getCustomer();

    public void setVersion(final Long version);

    public void setCustomer(final MyCustomerDraft customer);

    public static MyBusinessUnitAssociateDraft of() {
        return new MyBusinessUnitAssociateDraftImpl();
    }

    public static MyBusinessUnitAssociateDraft of(final MyBusinessUnitAssociateDraft template) {
        MyBusinessUnitAssociateDraftImpl instance = new MyBusinessUnitAssociateDraftImpl();
        instance.setVersion(template.getVersion());
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    public static MyBusinessUnitAssociateDraftBuilder builder() {
        return MyBusinessUnitAssociateDraftBuilder.of();
    }

    public static MyBusinessUnitAssociateDraftBuilder builder(final MyBusinessUnitAssociateDraft template) {
        return MyBusinessUnitAssociateDraftBuilder.of(template);
    }

    default <T> T withMyBusinessUnitAssociateDraft(Function<MyBusinessUnitAssociateDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAssociateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAssociateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitAssociateDraft>";
            }
        };
    }
}
