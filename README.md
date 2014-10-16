# om-editor-app

An example app using the om-codemirror library, an Om wrapper around the CodeMirror JavaScript text editor. See https://github.com/pbostrom/om-codemirror for more info.

## Usage
Add the `lein-cljsbuild` and `lein-cljsasset` plugins to `project.clj`.
```clj
:plugins [[lein-cljsbuild "1.0.3"]
          [lein-cljsasset "0.1.0"]]
```
Run the plugins:
    $ lein cljsbuild once
    $ lein cljsasset

then load `index.html` in your browser.

The editor is configured with two hotkeys: Ctrl-Shift-Z and Ctrl-Shift-X. Currently they just print to the console.
## License

Copyright © 2014 Paul Bostrom
Licensed under the Eclipse Public License.

http://www.eclipse.org/legal/epl-v10.html

