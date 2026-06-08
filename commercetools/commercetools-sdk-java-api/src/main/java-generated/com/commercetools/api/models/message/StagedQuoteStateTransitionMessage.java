
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteStateTransitionMessage stagedQuoteStateTransitionMessage = StagedQuoteStateTransitionMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StagedQuoteStateTransition")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteStateTransitionMessageImpl.class)
public interface StagedQuoteStateTransitionMessage extends Message {

    /**
     * discriminator value for StagedQuoteStateTransitionMessage
     */
    String STAGED_QUOTE_STATE_TRANSITION = "StagedQuoteStateTransition";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quote</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quote</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @return oldState
     */
    @Valid
    @JsonProperty("oldState")
    public StateReference getOldState();

    /**
     *  <p>Whether <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> transition validations were turned off during the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @return force
     */
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quote</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quote</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @param oldState value to be set
     */

    public void setOldState(final StateReference oldState);

    /**
     *  <p>Whether <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> transition validations were turned off during the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @param force value to be set
     */

    public void setForce(final Boolean force);

    /**
     * factory method
     * @return instance of StagedQuoteStateTransitionMessage
     */
    public static StagedQuoteStateTransitionMessage of() {
        return new StagedQuoteStateTransitionMessageImpl();
    }

    /**
     * factory method to create a shallow copy StagedQuoteStateTransitionMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteStateTransitionMessage of(final StagedQuoteStateTransitionMessage template) {
        StagedQuoteStateTransitionMessageImpl instance = new StagedQuoteStateTransitionMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        instance.setForce(template.getForce());
        return instance;
    }

    public StagedQuoteStateTransitionMessage copyDeep();

    /**
     * factory method to create a deep copy of StagedQuoteStateTransitionMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuoteStateTransitionMessage deepCopy(
            @Nullable final StagedQuoteStateTransitionMessage template) {
        if (template == null) {
            return null;
        }
        StagedQuoteStateTransitionMessageImpl instance = new StagedQuoteStateTransitionMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setOldState(com.commercetools.api.models.state.StateReference.deepCopy(template.getOldState()));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for StagedQuoteStateTransitionMessage
     * @return builder
     */
    public static StagedQuoteStateTransitionMessageBuilder builder() {
        return StagedQuoteStateTransitionMessageBuilder.of();
    }

    /**
     * create builder for StagedQuoteStateTransitionMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteStateTransitionMessageBuilder builder(final StagedQuoteStateTransitionMessage template) {
        return StagedQuoteStateTransitionMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteStateTransitionMessage(Function<StagedQuoteStateTransitionMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteStateTransitionMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteStateTransitionMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteStateTransitionMessage>";
            }
        };
    }
}
