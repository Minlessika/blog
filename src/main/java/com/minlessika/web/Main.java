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
import org.takes.facets.flash.TkFlash;
import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.TkFork;
import org.takes.facets.forward.TkForward;
import org.takes.http.Exit;
import org.takes.http.FtCli;

/**
 * Entry point.
 *
 * @since 0.0.1
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
public final class Main {

    /**
     * Ctor.
     */
    private Main() {
        // utility class
    }

    /**
     * Main.
     * @param args Arguments
     * @throws IOException If fails
     */
    @SuppressWarnings("PMD.ProhibitPublicStaticMethods")
    public static void main(final String[] args) throws IOException {
        new FtCli(
            new TkForward(
                new TkFlash(
                    new TkMimeTypes(
                        new TkFork(
                            new FkRegex("/robots\\.txt", ""),
                            new FkRegex("/", new TkIndex()),
                            new FkRegex("/home", new TkHome()),
                            new FkRegex(
                                String.format(
                                    "%s%s",
                                    "/index.php/2019/12/07/minlessika-accounting-une-",
                                    "comptabilite-mobile-et-collaborative-qui-vous-parle"
                                ),
                                new TkAccountingArticle1()
                            )
                        )
                    )
                )
            ),
            args
        ).start(Exit.NEVER);
    }

}
