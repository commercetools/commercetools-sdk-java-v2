
package com.commercetools.api.models.graph_ql;

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
 *             .line(1)
 *             .column(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLErrorLocationBuilder implements Builder<GraphQLErrorLocation> {

    private Integer line;

    private Integer column;

    /**
     *
     * @param line
     * @return Builder
     */

    public GraphQLErrorLocationBuilder line(final Integer line) {
        this.line = line;
        return this;
    }

    /**
     *
     * @param column
     * @return Builder
     */

    public GraphQLErrorLocationBuilder column(final Integer column) {
        this.column = column;
        return this;
    }

    public Integer getLine() {
        return this.line;
    }

    public Integer getColumn() {
        return this.column;
    }

    public GraphQLErrorLocation build() {
        Objects.requireNonNull(line, GraphQLErrorLocation.class + ": line is missing");
        Objects.requireNonNull(column, GraphQLErrorLocation.class + ": column is missing");
        return new GraphQLErrorLocationImpl(line, column);
    }

    /**
     * builds GraphQLErrorLocation without checking for non null required values
     */
    public GraphQLErrorLocation buildUnchecked() {
        return new GraphQLErrorLocationImpl(line, column);
    }

    public static GraphQLErrorLocationBuilder of() {
        return new GraphQLErrorLocationBuilder();
    }

    public static GraphQLErrorLocationBuilder of(final GraphQLErrorLocation template) {
        GraphQLErrorLocationBuilder builder = new GraphQLErrorLocationBuilder();
        builder.line = template.getLine();
        builder.column = template.getColumn();
        return builder;
    }

}
