
package com.commercetools.history.models.graph_ql;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLErrorLocationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLErrorLocation graphQLErrorLocation = GraphQLErrorLocation.builder()
 *             .line(0.3)
 *             .column(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLErrorLocationBuilder implements Builder<GraphQLErrorLocation> {

    private Long line;

    private Long column;

    /**
     *  <p>Line number of the query where the error occurred.</p>
     * @param line value to be set
     * @return Builder
     */

    public GraphQLErrorLocationBuilder line(final Long line) {
        this.line = line;
        return this;
    }

    /**
     *  <p>Position in <code>line</code> where the error occurred.</p>
     * @param column value to be set
     * @return Builder
     */

    public GraphQLErrorLocationBuilder column(final Long column) {
        this.column = column;
        return this;
    }

    /**
     *  <p>Line number of the query where the error occurred.</p>
     * @return line
     */

    public Long getLine() {
        return this.line;
    }

    /**
     *  <p>Position in <code>line</code> where the error occurred.</p>
     * @return column
     */

    public Long getColumn() {
        return this.column;
    }

    /**
     * builds GraphQLErrorLocation with checking for non-null required values
     * @return GraphQLErrorLocation
     */
    public GraphQLErrorLocation build() {
        Objects.requireNonNull(line, GraphQLErrorLocation.class + ": line is missing");
        Objects.requireNonNull(column, GraphQLErrorLocation.class + ": column is missing");
        return new GraphQLErrorLocationImpl(line, column);
    }

    /**
     * builds GraphQLErrorLocation without checking for non-null required values
     * @return GraphQLErrorLocation
     */
    public GraphQLErrorLocation buildUnchecked() {
        return new GraphQLErrorLocationImpl(line, column);
    }

    /**
     * factory method for an instance of GraphQLErrorLocationBuilder
     * @return builder
     */
    public static GraphQLErrorLocationBuilder of() {
        return new GraphQLErrorLocationBuilder();
    }

    /**
     * create builder for GraphQLErrorLocation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLErrorLocationBuilder of(final GraphQLErrorLocation template) {
        GraphQLErrorLocationBuilder builder = new GraphQLErrorLocationBuilder();
        builder.line = template.getLine();
        builder.column = template.getColumn();
        return builder;
    }

}
