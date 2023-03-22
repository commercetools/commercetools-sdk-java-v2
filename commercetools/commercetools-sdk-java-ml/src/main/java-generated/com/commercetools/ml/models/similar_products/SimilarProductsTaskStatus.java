
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

    public void setState(final TaskStatusEnum state);

    public void setExpires(final ZonedDateTime expires);

    public void setResult(final SimilarProductsPagedQueryResult result);

    public static SimilarProductsTaskStatus of() {
        return new SimilarProductsTaskStatusImpl();
    }

    public static SimilarProductsTaskStatus of(final SimilarProductsTaskStatus template) {
        SimilarProductsTaskStatusImpl instance = new SimilarProductsTaskStatusImpl();
        instance.setState(template.getState());
        instance.setExpires(template.getExpires());
        instance.setResult(template.getResult());
        return instance;
    }

    public static SimilarProductsTaskStatusBuilder builder() {
        return SimilarProductsTaskStatusBuilder.of();
    }

    public static SimilarProductsTaskStatusBuilder builder(final SimilarProductsTaskStatus template) {
        return SimilarProductsTaskStatusBuilder.of(template);
    }

    default <T> T withSimilarProductsTaskStatus(Function<SimilarProductsTaskStatus, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SimilarProductsTaskStatus> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SimilarProductsTaskStatus>() {
            @Override
            public String toString() {
                return "TypeReference<SimilarProductsTaskStatus>";
            }
        };
    }
}
