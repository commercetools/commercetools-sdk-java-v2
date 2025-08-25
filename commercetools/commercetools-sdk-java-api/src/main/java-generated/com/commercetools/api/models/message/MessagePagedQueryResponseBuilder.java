
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MessagePagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MessagePagedQueryResponse messagePagedQueryResponse = MessagePagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MessagePagedQueryResponseBuilder implements Builder<MessagePagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.message.Message> results;

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     * @return Builder
     */

    public MessagePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public MessagePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @param total value to be set
     * @return Builder
     */

    public MessagePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     * @return Builder
     */

    public MessagePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Message" rel="nofollow">Messages</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public MessagePagedQueryResponseBuilder results(final com.commercetools.api.models.message.Message... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Message" rel="nofollow">Messages</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public MessagePagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.message.Message> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Message" rel="nofollow">Messages</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public MessagePagedQueryResponseBuilder plusResults(final com.commercetools.api.models.message.Message... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Message" rel="nofollow">Messages</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public MessagePagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.message.MessageBuilder, Builder<? extends com.commercetools.api.models.message.Message>> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.message.MessageBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Message" rel="nofollow">Messages</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public MessagePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.message.MessageBuilder, Builder<? extends com.commercetools.api.models.message.Message>> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.message.MessageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */

    public Long getCount() {
        return this.count;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @return offset
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Message" rel="nofollow">Messages</a> matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.message.Message> getResults() {
        return this.results;
    }

    /**
     * builds MessagePagedQueryResponse with checking for non-null required values
     * @return MessagePagedQueryResponse
     */
    public MessagePagedQueryResponse build() {
        Objects.requireNonNull(limit, MessagePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, MessagePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, MessagePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, MessagePagedQueryResponse.class + ": results is missing");
        return new MessagePagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds MessagePagedQueryResponse without checking for non-null required values
     * @return MessagePagedQueryResponse
     */
    public MessagePagedQueryResponse buildUnchecked() {
        return new MessagePagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * factory method for an instance of MessagePagedQueryResponseBuilder
     * @return builder
     */
    public static MessagePagedQueryResponseBuilder of() {
        return new MessagePagedQueryResponseBuilder();
    }

    /**
     * create builder for MessagePagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MessagePagedQueryResponseBuilder of(final MessagePagedQueryResponse template) {
        MessagePagedQueryResponseBuilder builder = new MessagePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
