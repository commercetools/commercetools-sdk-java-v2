
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft;
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
 *             .plusAssociateRoleAssignments(associateRoleAssignmentsBuilder -> associateRoleAssignmentsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitAssociateDraftImpl.class)
public interface MyBusinessUnitAssociateDraft extends io.vrap.rmf.base.client.Draft<MyBusinessUnitAssociateDraft> {

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Customer to create and assign to the Business Unit.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public MyCustomerDraft getCustomer();

    /**
     *  <p>Roles assigned to the new Associate within a Business Unit.</p>
     * @return associateRoleAssignments
     */
    @NotNull
    @Valid
    @JsonProperty("associateRoleAssignments")
    public List<AssociateRoleAssignmentDraft> getAssociateRoleAssignments();

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Customer to create and assign to the Business Unit.</p>
     * @param customer value to be set
     */

    public void setCustomer(final MyCustomerDraft customer);

    /**
     *  <p>Roles assigned to the new Associate within a Business Unit.</p>
     * @param associateRoleAssignments values to be set
     */

    @JsonIgnore
    public void setAssociateRoleAssignments(final AssociateRoleAssignmentDraft... associateRoleAssignments);

    /**
     *  <p>Roles assigned to the new Associate within a Business Unit.</p>
     * @param associateRoleAssignments values to be set
     */

    public void setAssociateRoleAssignments(final List<AssociateRoleAssignmentDraft> associateRoleAssignments);

    /**
     * factory method
     * @return instance of MyBusinessUnitAssociateDraft
     */
    public static MyBusinessUnitAssociateDraft of() {
        return new MyBusinessUnitAssociateDraftImpl();
    }

    /**
     * factory method to create a shallow copy MyBusinessUnitAssociateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitAssociateDraft of(final MyBusinessUnitAssociateDraft template) {
        MyBusinessUnitAssociateDraftImpl instance = new MyBusinessUnitAssociateDraftImpl();
        instance.setVersion(template.getVersion());
        instance.setCustomer(template.getCustomer());
        instance.setAssociateRoleAssignments(template.getAssociateRoleAssignments());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyBusinessUnitAssociateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitAssociateDraft deepCopy(@Nullable final MyBusinessUnitAssociateDraft template) {
        if (template == null) {
            return null;
        }
        MyBusinessUnitAssociateDraftImpl instance = new MyBusinessUnitAssociateDraftImpl();
        instance.setVersion(template.getVersion());
        instance.setCustomer(com.commercetools.api.models.me.MyCustomerDraft.deepCopy(template.getCustomer()));
        instance.setAssociateRoleAssignments(Optional.ofNullable(template.getAssociateRoleAssignments())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitAssociateDraft
     * @return builder
     */
    public static MyBusinessUnitAssociateDraftBuilder builder() {
        return MyBusinessUnitAssociateDraftBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitAssociateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitAssociateDraftBuilder builder(final MyBusinessUnitAssociateDraft template) {
        return MyBusinessUnitAssociateDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitAssociateDraft(Function<MyBusinessUnitAssociateDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAssociateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAssociateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitAssociateDraft>";
            }
        };
    }
}
