/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2020 Minlessika Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.minlessika.web;

import java.io.IOException;
import java.util.Collections;
import org.takes.Request;
import org.takes.Response;
import org.takes.Scalar;
import org.takes.facets.fork.FkTypes;
import org.takes.facets.fork.RsFork;
import org.takes.rs.RsWithType;
import org.takes.rs.RsWrap;
import org.takes.rs.RsXslt;
import org.takes.rs.xe.XeSource;

/**
 * RsPage.
 *
 * @since 0.0.1
 */
public final class RsPage extends RsWrap {

    /**
     * Ctor.
     * @param xsl Xslt file path
     * @param req Request
     * @param src Xml data
     * @throws IOException If fails
     */
    RsPage(
        final String xsl,
        final Request req,
        final Scalar<Iterable<XeSource>> src
    ) throws IOException {
        super(
            RsPage.make(
                req,
                new RsContent(
                    xsl,
                    req,
                    src
                )
            )
        );
    }

    /**
     * Ctor.
     * @param xsl Xslt file path
     * @param req Request
     * @throws IOException If fails
     */
    RsPage(final String xsl, final Request req) throws IOException {
        super(
            RsPage.make(
                req,
                new RsContent(
                    xsl,
                    req,
                    Collections::emptyList
                )
            )
        );
    }

    /**
     * Create a response from Xslt file and Xml data.
     * @param req Request
     * @param res Content to complete
     * @return Complete response
     * @throws IOException If fails
     */
    private static Response make(
        final Request req,
        final Response res
    ) throws IOException {
        return new RsFork(
            req,
            new FkTypes(
                "*/*",
                new RsXslt(
                    new RsWithType(
                        res,
                        "text/html"
                    )
                )
            )
        );
    }
}
