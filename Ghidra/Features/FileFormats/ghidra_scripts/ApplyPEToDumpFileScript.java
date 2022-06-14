/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//Given a raw binary PE image,
//this script will create data structures
//representing the PE header. Including,
//but not limited to, the PE header,
//section headers, optional header, etc.
//@category Binary

import ghidra.app.script.GhidraScript;
import ghidra.file.formats.dump.cmd.ModuleToPeHelper;

public class ApplyPEToDumpFileScript extends GhidraScript {

	@Override
	public void run() throws Exception {
		if (currentProgram != null) {
			ModuleToPeHelper.queryModules(currentProgram, monitor);
		}
	}

}