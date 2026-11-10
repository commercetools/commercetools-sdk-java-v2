
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned when one of the following conditions occurs:</p>
 *  <ul>
 *   <li>A Customer reference (for example, <code>associates[*].customer</code> or <code>inheritedAssociates[*].customer</code>) is expanded on the <span>My Business Unit</span> endpoint.</li>
 *   <li>A <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discount</a> cannot be modified due to missing permissions for its assigned <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a>.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UnauthorizedError unauthorizedError = UnauthorizedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Unauthorized")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = UnauthorizedErrorImpl.class)
public interface UnauthorizedError extends ErrorObject {

    /**
     * discriminator value for UnauthorizedError
     */
    String UNAUTHORIZED = "Unauthorized";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Customer reference expansion not permitted on my business unit"</code> or <code>"Not allowed to edit this CartDiscount."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Keys of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> for which the required permission to modify is missing.</p>
     *  <p>This field is returned only for <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a>.</p>
     * @return storesWithoutPermission
     */

    @JsonProperty("storesWithoutPermission")
    public List<String> getStoresWithoutPermission();

    /**
     *  <p><code>"Customer reference expansion not permitted on my business unit"</code> or <code>"Not allowed to edit this CartDiscount."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Keys of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> for which the required permission to modify is missing.</p>
     *  <p>This field is returned only for <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a>.</p>
     * @param storesWithoutPermission values to be set
     */

    @JsonIgnore
    public void setStoresWithoutPermission(final String... storesWithoutPermission);

    /**
     *  <p>Keys of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> for which the required permission to modify is missing.</p>
     *  <p>This field is returned only for <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a>.</p>
     * @param storesWithoutPermission values to be set
     */

    public void setStoresWithoutPermission(final List<String> storesWithoutPermission);

    /**
     * factory method
     * @return instance of UnauthorizedError
     */
    public static UnauthorizedError of() {
        return new UnauthorizedErrorImpl();
    }

    /**
     * factory method to create a shallow copy UnauthorizedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static UnauthorizedError of(final UnauthorizedError template) {
        UnauthorizedErrorImpl instance = new UnauthorizedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setStoresWithoutPermission(template.getStoresWithoutPermission());
        return instance;
    }

    public UnauthorizedError copyDeep();

    /**
     * factory method to create a deep copy of UnauthorizedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static UnauthorizedError deepCopy(@Nullable final UnauthorizedError template) {
        if (template == null) {
            return null;
        }
        UnauthorizedErrorImpl instance = new UnauthorizedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setStoresWithoutPermission(
            Optional.ofNullable(template.getStoresWithoutPermission()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for UnauthorizedError
     * @return builder
     */
    public static UnauthorizedErrorBuilder builder() {
        return UnauthorizedErrorBuilder.of();
    }

    /**
     * create builder for UnauthorizedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UnauthorizedErrorBuilder builder(final UnauthorizedError template) {
        return UnauthorizedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withUnauthorizedError(Function<UnauthorizedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<UnauthorizedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<UnauthorizedError>() {
            @Override
            public String toString() {
                return "TypeReference<UnauthorizedError>";
            }
        };
    }
}
