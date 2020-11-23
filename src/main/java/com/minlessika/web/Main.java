/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2020 Minlessika Co.
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
import org.takes.facets.fork.FkMethods;
import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.TkFork;
import org.takes.facets.fork.TkMethods;
import org.takes.facets.forward.TkForward;
import org.takes.http.Exit;
import org.takes.http.FtCli;
import org.takes.tk.TkClasspath;
import org.takes.tk.TkSlf4j;
import org.takes.tk.TkWithType;

/**
 * Entry point.
 *
 * @since 0.0.1
 */
public final class Main {

    /**
     * Ctor.
     */
    private Main() {
    }

    /**
     * Main.
     *
     * @param args Arguments
     * @throws IOException if it fails
     */
    @SuppressWarnings("PMD.ProhibitPublicStaticMethods")
    public static void main(final String[] args) throws IOException {
        new FtCli(
            new TkSlf4j(
                new TkForward(
                    new TkFlash(
                        new TkFork(
                            new FkRegex(
                                ".+\\.css", 
                                new TkWithType(new TkClasspath(), "text/css")
                            ),
                            new FkRegex(
                                ".+\\.svg", 
                                new TkWithType(new TkClasspath(), "image/svg+xml")
                            ),
                            new FkRegex(
                                ".+\\.png", 
                                new TkWithType(new TkClasspath(), "image/png")
                            ),
                            new FkRegex(
                                ".+\\.jpg", 
                                new TkWithType(new TkClasspath(), "image/jpeg")
                            ),
                            new FkRegex(
                                ".+\\.ico", 
                                new TkWithType(new TkClasspath(), "image/ico")
                            ),
                            new FkRegex(
                                ".+\\.woff2", 
                                new TkWithType(new TkClasspath(), "application/font-woff")
                            ),
                            new FkRegex(
                                ".+\\.woff", 
                                new TkWithType(new TkClasspath(), "application/font-woff")
                            ),
                            new FkRegex(
                                ".+\\.ttf", 
                                new TkWithType(new TkClasspath(), "application/octet-stream")
                            ),
                            new FkRegex(
                                ".+\\.js", 
                                new TkWithType(new TkClasspath(), "application/javascript")
                            ),
                            new FkRegex("/robots\\.txt", ""),
                            new FkRegex("/", new TkIndex()),
                            new FkRegex("/home", new TkHome()),
                            new FkRegex("/index.php/2019/12/07/minlessika-accounting-une-comptabilite-mobile-et-collaborative-qui-vous-parle/", new TkAccountingArticle1())  
                        )
                    )
                )
            ), 
            args
        ).start(Exit.NEVER);
    }

}
