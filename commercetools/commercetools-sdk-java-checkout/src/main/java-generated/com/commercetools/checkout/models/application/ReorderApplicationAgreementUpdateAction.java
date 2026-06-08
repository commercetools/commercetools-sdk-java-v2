
package com.commercetools.checkout.models.application;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ReorderApplicationAgreementUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReorderApplicationAgreementUpdateAction reorderApplicationAgreementUpdateAction = ReorderApplicationAgreementUpdateAction.builder()
 *             .plusAgreementIds(agreementIdsBuilder -> agreementIdsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("reorderAgreement")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReorderApplicationAgreementUpdateActionImpl.class)
public interface ReorderApplicationAgreementUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for ReorderApplicationAgreementUpdateAction
     */
    String REORDER_AGREEMENT = "reorderAgreement";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>Array of agreement IDs.</p>
     * @return agreementIds
     */
    @NotNull
    @JsonProperty("agreementIds")
    public List<String> getAgreementIds();

    /**
     *  <p>Array of agreement IDs.</p>
     * @param agreementIds values to be set
     */

    @JsonIgnore
    public void setAgreementIds(final String... agreementIds);

    /**
     *  <p>Array of agreement IDs.</p>
     * @param agreementIds values to be set
     */

    public void setAgreementIds(final List<String> agreementIds);

    /**
     * factory method
     * @return instance of ReorderApplicationAgreementUpdateAction
     */
    public static ReorderApplicationAgreementUpdateAction of() {
        return new ReorderApplicationAgreementUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy ReorderApplicationAgreementUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReorderApplicationAgreementUpdateAction of(final ReorderApplicationAgreementUpdateAction template) {
        ReorderApplicationAgreementUpdateActionImpl instance = new ReorderApplicationAgreementUpdateActionImpl();
        instance.setAgreementIds(template.getAgreementIds());
        return instance;
    }

    public ReorderApplicationAgreementUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of ReorderApplicationAgreementUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReorderApplicationAgreementUpdateAction deepCopy(
            @Nullable final ReorderApplicationAgreementUpdateAction template) {
        if (template == null) {
            return null;
        }
        ReorderApplicationAgreementUpdateActionImpl instance = new ReorderApplicationAgreementUpdateActionImpl();
        instance.setAgreementIds(Optional.ofNullable(template.getAgreementIds()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ReorderApplicationAgreementUpdateAction
     * @return builder
     */
    public static ReorderApplicationAgreementUpdateActionBuilder builder() {
        return ReorderApplicationAgreementUpdateActionBuilder.of();
    }

    /**
     * create builder for ReorderApplicationAgreementUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReorderApplicationAgreementUpdateActionBuilder builder(
            final ReorderApplicationAgreementUpdateAction template) {
        return ReorderApplicationAgreementUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReorderApplicationAgreementUpdateAction(
            Function<ReorderApplicationAgreementUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReorderApplicationAgreementUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReorderApplicationAgreementUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReorderApplicationAgreementUpdateAction>";
            }
        };
    }
}
