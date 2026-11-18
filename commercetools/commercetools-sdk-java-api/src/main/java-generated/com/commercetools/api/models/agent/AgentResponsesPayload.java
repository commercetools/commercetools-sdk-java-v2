
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Structured fields for the <code>payload</code> part of a <code>multipart/form-data</code> <span>/responses</span> request to Intake. <code>prompt</code> is optional when files are attached or <code>shoppingList</code> is set.</p>
 *  <p>For an <code>application/json</code> request, use <a href="https://docs.commercetools.com/apis/ctp:api:type:AgentResponsesRequest" rel="nofollow">AgentResponsesRequest</a> instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentResponsesPayload agentResponsesPayload = AgentResponsesPayload.builder()
 *             .outputType(AgentResponsesOutputType.CART)
 *             .locale("{locale}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentResponsesPayloadImpl.class)
public interface AgentResponsesPayload {

    /**
     *  <p>The entity to create.</p>
     * @return outputType
     */
    @NotNull
    @JsonProperty("outputType")
    public AgentResponsesOutputType getOutputType();

    /**
     *  <p>A valid BCP 47 language tag, for example <code>en-US</code>.</p>
     * @return locale
     */
    @NotNull
    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Natural-language description of the entity to create, such as the body of an email or a note. Required if no file is attached and <code>shoppingList</code> is not set. For a Shopping List, the name of the list must be stated in either the prompt or an attached file.</p>
     * @return prompt
     */

    @JsonProperty("prompt")
    public String getPrompt();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> to use for the request. Takes precedence over the Business Unit of the Shopping List in <code>shoppingList</code>. If omitted, Intake resolves it from the input or from the Shopping List.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to use for the request. Takes precedence over the Store of the Shopping List in <code>shoppingList</code>. If omitted, Intake resolves it from the input or from the Shopping List.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a> to create the Cart or Quote Request from. Intake reads the list once and uses its Line Items as the Products of the request. The ShoppingList must exist and be accessible to the caller.</p>
     *  <p>If the Shopping List can't be read, a <a href="https://docs.commercetools.com/apis/ctp:api:type:AgentShoppingListUnresolvedError" rel="nofollow">ShoppingListUnresolved</a> error is returned.</p>
     *  <p>If files are attached, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
     *  <p>If <code>outputType</code> is <code>ShoppingList</code>, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
     * @return shoppingList
     */
    @Valid
    @JsonProperty("shoppingList")
    public ShoppingListResourceIdentifier getShoppingList();

    /**
     *  <p>The entity to create.</p>
     * @param outputType value to be set
     */

    public void setOutputType(final AgentResponsesOutputType outputType);

    /**
     *  <p>A valid BCP 47 language tag, for example <code>en-US</code>.</p>
     * @param locale value to be set
     */

    public void setLocale(final String locale);

    /**
     *  <p>Natural-language description of the entity to create, such as the body of an email or a note. Required if no file is attached and <code>shoppingList</code> is not set. For a Shopping List, the name of the list must be stated in either the prompt or an attached file.</p>
     * @param prompt value to be set
     */

    public void setPrompt(final String prompt);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> to use for the request. Takes precedence over the Business Unit of the Shopping List in <code>shoppingList</code>. If omitted, Intake resolves it from the input or from the Shopping List.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to use for the request. Takes precedence over the Store of the Shopping List in <code>shoppingList</code>. If omitted, Intake resolves it from the input or from the Shopping List.</p>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a> to create the Cart or Quote Request from. Intake reads the list once and uses its Line Items as the Products of the request. The ShoppingList must exist and be accessible to the caller.</p>
     *  <p>If the Shopping List can't be read, a <a href="https://docs.commercetools.com/apis/ctp:api:type:AgentShoppingListUnresolvedError" rel="nofollow">ShoppingListUnresolved</a> error is returned.</p>
     *  <p>If files are attached, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
     *  <p>If <code>outputType</code> is <code>ShoppingList</code>, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
     * @param shoppingList value to be set
     */

    public void setShoppingList(final ShoppingListResourceIdentifier shoppingList);

    /**
     * factory method
     * @return instance of AgentResponsesPayload
     */
    public static AgentResponsesPayload of() {
        return new AgentResponsesPayloadImpl();
    }

    /**
     * factory method to create a shallow copy AgentResponsesPayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentResponsesPayload of(final AgentResponsesPayload template) {
        AgentResponsesPayloadImpl instance = new AgentResponsesPayloadImpl();
        instance.setOutputType(template.getOutputType());
        instance.setLocale(template.getLocale());
        instance.setPrompt(template.getPrompt());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setStore(template.getStore());
        instance.setShoppingList(template.getShoppingList());
        return instance;
    }

    public AgentResponsesPayload copyDeep();

    /**
     * factory method to create a deep copy of AgentResponsesPayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentResponsesPayload deepCopy(@Nullable final AgentResponsesPayload template) {
        if (template == null) {
            return null;
        }
        AgentResponsesPayloadImpl instance = new AgentResponsesPayloadImpl();
        instance.setOutputType(template.getOutputType());
        instance.setLocale(template.getLocale());
        instance.setPrompt(template.getPrompt());
        instance.setBusinessUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier
                .deepCopy(template.getBusinessUnit()));
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        instance.setShoppingList(com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier
                .deepCopy(template.getShoppingList()));
        return instance;
    }

    /**
     * builder factory method for AgentResponsesPayload
     * @return builder
     */
    public static AgentResponsesPayloadBuilder builder() {
        return AgentResponsesPayloadBuilder.of();
    }

    /**
     * create builder for AgentResponsesPayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentResponsesPayloadBuilder builder(final AgentResponsesPayload template) {
        return AgentResponsesPayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentResponsesPayload(Function<AgentResponsesPayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentResponsesPayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentResponsesPayload>() {
            @Override
            public String toString() {
                return "TypeReference<AgentResponsesPayload>";
            }
        };
    }
}
