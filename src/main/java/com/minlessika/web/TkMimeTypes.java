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

import org.takes.Take;
import org.takes.facets.fork.FkFixed;
import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.TkFork;
import org.takes.tk.TkClasspath;
import org.takes.tk.TkWithType;
import org.takes.tk.TkWrap;

/**
 * Take for mime types configuration.
 *
 * @since 0.0.1
 */
public final class TkMimeTypes extends TkWrap {

    /**
     * Ctor.
     * @param take Take to decorate
     */
    public TkMimeTypes(final Take take) {
        super(
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
                    ".+\\.ttf",
                    new TkWithType(new TkClasspath(), "application/octet-stream")
                ),
                new FkRegex(
                    ".+\\.js",
                    new TkWithType(new TkClasspath(), "application/javascript")
                ),
                new FkFixed(take)
            )
        );
    }

}
