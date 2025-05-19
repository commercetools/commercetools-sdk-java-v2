
package com.commercetools.importapi.models.importsummaries;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>The number of resources in each Processing State.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OperationStates operationStates = OperationStates.builder()
 *             .processing(1)
 *             .validationFailed(1)
 *             .unresolved(1)
 *             .waitForMasterVariant(1)
 *             .imported(1)
 *             .rejected(1)
 *             .canceled(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OperationStatesImpl.class)
public interface OperationStates {

    /**
     *  <p>The number of resources in the <code>processing</code> state.</p>
     * @return processing
     */
    @NotNull
    @JsonProperty("processing")
    public Long getProcessing();

    /**
     *  <p>The number of resources in the <code>validationFailed</code> state.</p>
     * @return validationFailed
     */
    @NotNull
    @JsonProperty("validationFailed")
    public Long getValidationFailed();

    /**
     *  <p>The number of resources in the <code>unresolved</code> state.</p>
     * @return unresolved
     */
    @NotNull
    @JsonProperty("unresolved")
    public Long getUnresolved();

    /**
     *  <p>The number of resources in the <code>waitForMasterVariant</code> state.</p>
     * @return waitForMasterVariant
     */
    @NotNull
    @JsonProperty("waitForMasterVariant")
    public Long getWaitForMasterVariant();

    /**
     *  <p>The number of resources in the <code>imported</code> state.</p>
     * @return imported
     */
    @NotNull
    @JsonProperty("imported")
    public Long getImported();

    /**
     *  <p>The number of resources in the <code>rejected</code> state.</p>
     * @return rejected
     */
    @NotNull
    @JsonProperty("rejected")
    public Long getRejected();

    /**
     *  <p>The number of resources in the <code>canceled</code> state.</p>
     * @return canceled
     */
    @NotNull
    @JsonProperty("canceled")
    public Long getCanceled();

    /**
     *  <p>The number of resources in the <code>processing</code> state.</p>
     * @param processing value to be set
     */

    public void setProcessing(final Long processing);

    /**
     *  <p>The number of resources in the <code>validationFailed</code> state.</p>
     * @param validationFailed value to be set
     */

    public void setValidationFailed(final Long validationFailed);

    /**
     *  <p>The number of resources in the <code>unresolved</code> state.</p>
     * @param unresolved value to be set
     */

    public void setUnresolved(final Long unresolved);

    /**
     *  <p>The number of resources in the <code>waitForMasterVariant</code> state.</p>
     * @param waitForMasterVariant value to be set
     */

    public void setWaitForMasterVariant(final Long waitForMasterVariant);

    /**
     *  <p>The number of resources in the <code>imported</code> state.</p>
     * @param imported value to be set
     */

    public void setImported(final Long imported);

    /**
     *  <p>The number of resources in the <code>rejected</code> state.</p>
     * @param rejected value to be set
     */

    public void setRejected(final Long rejected);

    /**
     *  <p>The number of resources in the <code>canceled</code> state.</p>
     * @param canceled value to be set
     */

    public void setCanceled(final Long canceled);

    /**
     * factory method
     * @return instance of OperationStates
     */
    public static OperationStates of() {
        return new OperationStatesImpl();
    }

    /**
     * factory method to create a shallow copy OperationStates
     * @param template instance to be copied
     * @return copy instance
     */
    public static OperationStates of(final OperationStates template) {
        OperationStatesImpl instance = new OperationStatesImpl();
        instance.setProcessing(template.getProcessing());
        instance.setValidationFailed(template.getValidationFailed());
        instance.setUnresolved(template.getUnresolved());
        instance.setWaitForMasterVariant(template.getWaitForMasterVariant());
        instance.setImported(template.getImported());
        instance.setRejected(template.getRejected());
        instance.setCanceled(template.getCanceled());
        return instance;
    }

    public OperationStates copyDeep();

    /**
     * factory method to create a deep copy of OperationStates
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OperationStates deepCopy(@Nullable final OperationStates template) {
        if (template == null) {
            return null;
        }
        OperationStatesImpl instance = new OperationStatesImpl();
        instance.setProcessing(template.getProcessing());
        instance.setValidationFailed(template.getValidationFailed());
        instance.setUnresolved(template.getUnresolved());
        instance.setWaitForMasterVariant(template.getWaitForMasterVariant());
        instance.setImported(template.getImported());
        instance.setRejected(template.getRejected());
        instance.setCanceled(template.getCanceled());
        return instance;
    }

    /**
     * builder factory method for OperationStates
     * @return builder
     */
    public static OperationStatesBuilder builder() {
        return OperationStatesBuilder.of();
    }

    /**
     * create builder for OperationStates instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OperationStatesBuilder builder(final OperationStates template) {
        return OperationStatesBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOperationStates(Function<OperationStates, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OperationStates> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OperationStates>() {
            @Override
            public String toString() {
                return "TypeReference<OperationStates>";
            }
        };
    }
}
