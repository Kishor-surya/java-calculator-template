import React, { useState } from "react";
import api from "../services/api";

function Calculator() {
  const [a, setA] = useState(0);
  const [b, setB] = useState(0);
  const [result, setResult] = useState(null);

  const handleAdd = async () => {
    const res = await api.get(`/calculator/add?a=${a}&b=${b}`);
    setResult(res.data.result);
  };

  return (
    <div>
      <input type="number" value={a} onChange={e => setA(e.target.value)} />
      <input type="number" value={b} onChange={e => setB(e.target.value)} />
      <button onClick={handleAdd}>Add</button>
      <p>Result: {result}</p>
    </div>
  );
}

export default Calculator;
