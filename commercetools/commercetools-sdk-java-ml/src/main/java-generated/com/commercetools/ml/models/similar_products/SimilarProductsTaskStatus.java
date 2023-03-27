
package com.commercetools.ml.models.similar_products;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.ml.models.common.TaskStatusEnum;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Represents a URL path to poll to get the results of an Asynchronous Request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SimilarProductsTaskStatus similarProductsTaskStatus = SimilarProductsTaskStatus.builder()
 *             .state(TaskStatusEnum.PENDING)
 *             .result(resultBuilder -> resultBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SimilarProductsTaskStatusImpl.class)
public interface SimilarProductsTaskStatus {

    /**
     *
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public TaskStatusEnum getState();

    /**
     *  <p>The expiry date of the result. You cannot access the result after the expiry date. Default: 1 day after the result first becomes available. This is only available when the TaskStatus state is SUCCESS.</p>
     * @return expires
     */

    @JsonProperty("expires")
    public ZonedDateTime getExpires();

    /**
     *  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>
     * @return result
     */
    @NotNull
    @Valid
    @JsonProperty("result")
    public SimilarProductsPagedQueryResult getResult();

    /**
     * set state
     * @param state value to be set
     */

    public void setState(final TaskStatusEnum state);

    /**
     *  <p>The expiry date of the result. You cannot access the result after the expiry date. Default: 1 day after the result first becomes available. This is only available when the TaskStatus state is SUCCESS.</p>
     * @param expires value to be set
     */

    public void setExpires(final ZonedDateTime expires);

    /**
     *  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>
     * @param result value to be set
     */

    public void setResult(final SimilarProductsPagedQueryResult result);

    /**
     * factory method
     * @return instance of SimilarProductsTaskStatus
     */
    public static SimilarProductsTaskStatus of() {
        return new SimilarProductsTaskStatusImpl();
    }

    /**
     * factory method to copy an instance of SimilarProductsTaskStatus
     * @param template instance to be copied
     * @return copy instance
     */
    public static SimilarProductsTaskStatus of(final SimilarProductsTaskStatus template) {
        SimilarProductsTaskStatusImpl instance = new SimilarProductsTaskStatusImpl();
        instance.setState(template.getState());
        instance.setExpires(template.getExpires());
        instance.setResult(template.getResult());
        return instance;
    }

    /**
     * builder factory method for SimilarProductsTaskStatus
     * @return builder
     */
    public static SimilarProductsTaskStatusBuilder builder() {
        return SimilarProductsTaskStatusBuilder.of();
    }

    /**
     * create builder for SimilarProductsTaskStatus instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SimilarProductsTaskStatusBuilder builder(final SimilarProductsTaskStatus template) {
        return SimilarProductsTaskStatusBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSimilarProductsTaskStatus(Function<SimilarProductsTaskStatus, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SimilarProductsTaskStatus> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SimilarProductsTaskStatus>() {
            @Override
            public String toString() {
                return "TypeReference<SimilarProductsTaskStatus>";
            }
        };
    }
}
