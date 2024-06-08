
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.AssociateDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Updating the Associate on a Business Unit generates the BusinessUnitAssociateChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitChangeAssociateAction myBusinessUnitChangeAssociateAction = MyBusinessUnitChangeAssociateAction.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitChangeAssociateActionImpl.class)
public interface MyBusinessUnitChangeAssociateAction extends MyBusinessUnitUpdateAction {

    /**
     * discriminator value for MyBusinessUnitChangeAssociateAction
     */
    String CHANGE_ASSOCIATE = "changeAssociate";

    /**
     *  <p>The Associate to add.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public AssociateDraft getAssociate();

    /**
     *  <p>The Associate to add.</p>
     * @param associate value to be set
     */

    public void setAssociate(final AssociateDraft associate);

    /**
     * factory method
     * @return instance of MyBusinessUnitChangeAssociateAction
     */
    public static MyBusinessUnitChangeAssociateAction of() {
        return new MyBusinessUnitChangeAssociateActionImpl();
    }

    /**
     * factory method to create a shallow copy MyBusinessUnitChangeAssociateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitChangeAssociateAction of(final MyBusinessUnitChangeAssociateAction template) {
        MyBusinessUnitChangeAssociateActionImpl instance = new MyBusinessUnitChangeAssociateActionImpl();
        instance.setAssociate(template.getAssociate());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyBusinessUnitChangeAssociateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitChangeAssociateAction deepCopy(
            @Nullable final MyBusinessUnitChangeAssociateAction template) {
        if (template == null) {
            return null;
        }
        MyBusinessUnitChangeAssociateActionImpl instance = new MyBusinessUnitChangeAssociateActionImpl();
        instance.setAssociate(
            com.commercetools.api.models.business_unit.AssociateDraft.deepCopy(template.getAssociate()));
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitChangeAssociateAction
     * @return builder
     */
    public static MyBusinessUnitChangeAssociateActionBuilder builder() {
        return MyBusinessUnitChangeAssociateActionBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitChangeAssociateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitChangeAssociateActionBuilder builder(
            final MyBusinessUnitChangeAssociateAction template) {
        return MyBusinessUnitChangeAssociateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitChangeAssociateAction(Function<MyBusinessUnitChangeAssociateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitChangeAssociateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitChangeAssociateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitChangeAssociateAction>";
            }
        };
    }
}
