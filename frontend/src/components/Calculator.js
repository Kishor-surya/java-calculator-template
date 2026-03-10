import React, { useState } from "react";
import api from "../services/api";

function Calculator() {
  const [a, setA] = useState(0);
  const [b, setB] = useState(0);
  const [result, setResult] = useState(null);

  const handleOperation = async (op) => {
    const res = await api.get(`/calculator/${op}?a=${a}&b=${b}`);
    setResult(res.data.result);
  };

  return (
    <div>
      <input type="number" value={a} onChange={e => setA(e.target.value)} />
      <input type="number" value={b} onChange={e => setB(e.target.value)} />
      <button onClick={() => handleOperation("add")}>Add</button>
      <button onClick={() => handleOperation("subtract")}>Subtract</button>
      <button onClick={() => handleOperation("multiply")}>Multiply</button>
      <button onClick={() => handleOperation("divide")}>Divide</button>
      <p>Result: {result}</p>
    </div>
  );
}

export default Calculator;
